package co.finalfour.beerme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.BreweryResponse;
import co.finalfour.beerme.entity.beer.BeerResponse;

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
		
				String query = "";
				if (postalCode != null) {
					query = "postalCode";
				} else if (locality != null) {
					query = "locality";
				} else if (region != null) {
					query = "region";
				} 
				
				String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/locations/")	
				.queryParam(query, query)
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
	
	//To sear beers by hops
	//public List<Beer> findBeersBy
	
}
