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
	
}
