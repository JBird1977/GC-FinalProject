package co.finalfour.beerme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.finalfour.beerme.entity.beer.Adjunct;
import co.finalfour.beerme.entity.beer.AdjunctResponse;
import co.finalfour.beerme.entity.beer.AdjunctSingleResponse;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.BeerResponse;
import co.finalfour.beerme.entity.beer.BeerSingleResponse;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.BreweryResponse;
import co.finalfour.beerme.entity.beer.Hop;
import co.finalfour.beerme.entity.beer.HopResponse;
import co.finalfour.beerme.entity.beer.HopSingleResponse;

@Component
public class SearchApiService {

	
	@Value("${beer.key}")
	private String key;

	private RestTemplate restTemplate = new RestTemplate();

	public Beer findBeerById(String id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/" + id + "/")
				.queryParam("key", key)
				.toUriString();
		BeerSingleResponse response = restTemplate.getForObject(url, BeerSingleResponse.class);		
		return response.getData();		
	}

	public List<Beer> findAllBeers() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beers/")
				.queryParam("key", key)
				.toUriString();
		BeerResponse response = restTemplate.getForObject(url, BeerResponse.class);		
		return response.getData();
	}
	
	public List<Adjunct> findAllAdjuncts() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/adjuncts/")
				.queryParam("key", key)
				.toUriString();
		AdjunctResponse response = restTemplate.getForObject(url, AdjunctResponse.class);		
		System.out.println(url);
		return response.getData();
	}

	public List<Hop> findAllHop() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/hops/")
				.queryParam("key", key)
				.toUriString();
		HopResponse response = restTemplate.getForObject(url, HopResponse.class);		
		System.out.println(url);
		return response.getData();
	}
	
	public Hop findHopById(int hopId) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/hop/" + hopId + "/")
				.queryParam("key", key)
				.toUriString();
		HopSingleResponse response = restTemplate.getForObject(url, HopSingleResponse.class);		
		return response.getData();		
	}
	
	
	public List<Brewery> findBreweriesByBeerId(String id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/" + id + "/breweries/")
				.queryParam("key", key)
				.toUriString();
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);		
		return response.getData();	
	}
	
	public Adjunct findAdjunctById(int adjunctId) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/adjunct/" + adjunctId + "/")
				.queryParam("key", key)
				.toUriString();
		AdjunctSingleResponse response = restTemplate.getForObject(url, AdjunctSingleResponse.class);		
		return response.getData();		
	}
	
}

