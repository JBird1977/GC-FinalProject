package co.finalfour.beerme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.BreweryResponse;
import co.finalfour.beerme.entity.beer.Ingredient;
import co.finalfour.beerme.entity.beer.Mood;
import co.finalfour.beerme.entity.beer.BeerResponse;
import co.finalfour.beerme.entity.beer.IngredientsResponse;


@Component
public class BeerApiService {

	@Value("${beer.key}")
	private String key;

	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Brewery> findBreweries() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/breweries/")
				.queryParam("key", key)
				.toUriString();
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);		
		return response.getData();
	}
	
	public List<Beer> findBeers() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beers/")
				.queryParam("key", key)
				.toUriString();
		BeerResponse response = restTemplate.getForObject(url, BeerResponse.class);		
		return response.getData();
	}
	
	public List<Brewery> findBreweriesByLocation(String postalCode, String locality, String region) {
		
				String queryKey = "";
				String queryValue = "";
				
				if (postalCode != null) {
					queryKey = "postalCode";
					queryValue = postalCode;
				} else if (locality != null) {
					queryKey = "locality";
					queryValue = locality;
				} else if (region != null) {
					queryKey = "region";
					queryValue = region;
				} 
				
				String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/locations/")	
				.queryParam(queryKey, queryValue)
				.queryParam("key", key)
				.toUriString();
				
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);				
		return response.getData();
	}
	//To search beers at a particular brewery.
	public List<Brewery> findBeersByBreweries(String breweryId){
											//Sample: http://api.brewerydb.com/v2/brewery/BznahA/beers?key=b2599794d8cfacff731e8ed3493f43bd
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/brewery/"+breweryId+"/beers"+key)
				.toUriString();
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);
		return response.getData();
		
	}
	//To search beers by abv
	public List<Beer> findBeersByAbv(String name, String styleId){
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/"+name+"/"+styleId+"/abv"+key)
				.toUriString();
		BeerResponse response = restTemplate.getForObject(url, BeerResponse.class );
		return response.getData();
	}
	
	//To search ingredients.
	//public List<Beer> findBeersBy
	public List<Ingredient> findIngredientsByBeer(String id){
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/"+id+"/ingredients/?key="+key)
				.toUriString();
		System.out.println("URL" + url);
		IngredientsResponse response = restTemplate.getForObject(url, IngredientsResponse.class );
		System.out.println("Response = "+response);
		return response.getData();
		
	}
	
}