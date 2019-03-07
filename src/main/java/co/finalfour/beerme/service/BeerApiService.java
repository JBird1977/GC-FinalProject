package co.finalfour.beerme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.finalfour.beerme.entity.Brewery;
import co.finalfour.beerme.entity.BreweryResponse;

@Component
public class BeerApiService {

	@Value("${beer.key}")
	private String key;

	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Brewery> findBreweries() {

		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/breweries/")
				.queryParam("key", key)
				.toUriString();
		
		System.out.println("FIND BREWERIES SERVICE = " + url);
		
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);
		
		System.out.println("RESPONSE = " + response);
		
		return response.getData();

	}
	
}
