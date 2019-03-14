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
import co.finalfour.beerme.entity.beer.BrewerySingleResponse;
import co.finalfour.beerme.entity.beer.Hop;
import co.finalfour.beerme.entity.beer.HopResponse;
import co.finalfour.beerme.entity.beer.HopSingleResponse;
import co.finalfour.beerme.entity.beer.Location;
import co.finalfour.beerme.entity.beer.LocationsResponse;
import co.finalfour.beerme.entity.beer.Style;
import co.finalfour.beerme.entity.beer.StyleResponse;

@Component
public class SearchApiService {

	@Value("${freebeer.key}")
	private String freeKey;
	
	@Value("${paidbeer.key}")
	private String paidKey;

	private RestTemplate restTemplate = new RestTemplate();

////////////////////// get beer /////////////////////
	
	//-------------- list of beers ---------------//
	
	public List<Beer> findAllBeers() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beers/")
				.queryParam("key", freeKey)
				.toUriString();
		BeerResponse response = restTemplate.getForObject(url, BeerResponse.class);		
		return response.getData();
	}
	
	public List<Beer> beerStyle(Number styleId) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beers/")
				.queryParam("styleId", styleId)
				.queryParam("key", freeKey)
				.toUriString();
		BeerResponse response = restTemplate.getForObject(url, BeerResponse.class);		
		return response.getData();			
	}
	
	//--------------- single beer ----------------//
	
	public Beer findBeerById(String id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/" + id + "/")
				.queryParam("key", freeKey)
				.toUriString();
		BeerSingleResponse response = restTemplate.getForObject(url, BeerSingleResponse.class);	
		return response.getData();		
	}
	
	public Beer randomBeer(Beer beer) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/random/")
				.queryParam("abv", beer.getAbv())
				.queryParam("ibu", beer.getIbu())
				.queryParam("glasswareId", beer.getGlasswareId())
				.queryParam("srmId", beer.getSrmId())
				.queryParam("availableId", beer.getAvailableId())
				.queryParam("styleId", beer.getStyleId())
				.queryParam("isOrganic", beer.getIsOrganic())
				.queryParam("hasLabels", beer.getHasLabels())
				.queryParam("year", beer.getYear())
				.queryParam("withBreweries", beer.getWithBreweries())
				.queryParam("withSocialAccounts", beer.getWithSocialAccounts())
				.queryParam("withIngredients", beer.getWithIngredients())
				.queryParam("key", freeKey)
				.toUriString();
		BeerSingleResponse response = restTemplate.getForObject(url, BeerSingleResponse.class);		
		return response.getData();			
	}
	
	//*****PAIDKEY
	public Beer findBeerByUPC(Long code) {
		String url = UriComponentsBuilder.fromHttpUrl("http://http://api.brewerydb.com/v2//search/upc/")
				.queryParam("code", code)
				.queryParam("key", paidKey)
				.toUriString();
		BeerSingleResponse response = restTemplate.getForObject(url, BeerSingleResponse.class);	
		return response.getData();		
	}
	
//////////////////// get brewery ////////////////////
	
	//------------ list of breweries -----------//

	public List<Brewery> findBreweriesByBeerId(String id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/beer/" + id + "/breweries/")
				.queryParam("key", freeKey)
				.toUriString();
		BreweryResponse response = restTemplate.getForObject(url, BreweryResponse.class);		
		return response.getData();	
	}
	
	//*****PAIDKEY
	public List<Location> findBreweriesByGeo(double lat, double lng, double radius,
			String unit, char withSocialAccounts, char withGuilds, char withAlternateNames) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/search/geo/point/")
				.queryParam("lat", lat)
				.queryParam("lng", lng)
				.queryParam("radius", radius)
				.queryParam("unit", unit)
				.queryParam("withSocialAccounts", withSocialAccounts)
				.queryParam("withGuilds", withGuilds)
				.queryParam("withAlternateNames", withAlternateNames)
				.queryParam("key", paidKey)
				.toUriString();
		System.out.println("GEO url: " + url);
		LocationsResponse response = restTemplate.getForObject(url, LocationsResponse.class);		
		System.out.println("GEO SIZE: " + response.getData().size());
		return response.getData();	
	}
	
	//------------- single brewery -------------//
	
	public Brewery findBreweryById(String id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/brewery/" + id + "/")
				.queryParam("key", freeKey)
				.toUriString();
		System.out.println("BREWERY URL = " + url);
		BrewerySingleResponse response = restTemplate.getForObject(url, BrewerySingleResponse.class);		
		return response.getData();		
	}
	
	public Brewery randomBrewery(Brewery brewery) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/brewery/random/")
				.queryParam("established", brewery.getEstablished())
				.queryParam("isOrganic", brewery.getIsOrganic())
				.queryParam("withSocialAccounts", brewery.getWithSocialAccounts())
				.queryParam("withGuilds", brewery.getWithGuilds())
				.queryParam("withLocations", brewery.getWithLocations())
				.queryParam("withAlternativeNames", brewery.getWithAlternativeNames())
				.queryParam("key", freeKey)
				.toUriString();
		BrewerySingleResponse response = restTemplate.getForObject(url, BrewerySingleResponse.class);		
		return response.getData();			
	}
		
///////////////// get other ///////////////////
	
	//------------ adjunct -------------//
	
	public List<Adjunct> findAllAdjuncts() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/adjuncts/")
				.queryParam("key", freeKey)
				.toUriString();
		AdjunctResponse response = restTemplate.getForObject(url, AdjunctResponse.class);		
		return response.getData();
	}
	
	public Adjunct findAdjunctById(int id) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/adjunct/" + id + "/")
				.queryParam("key", freeKey)
				.toUriString();
		AdjunctSingleResponse response = restTemplate.getForObject(url, AdjunctSingleResponse.class);		
		return response.getData();		
	}
	
	//-------------- style ---------------//
	
	public List<Style> searchStyle(String styleSearch) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/search/style/")
				.queryParam("q", styleSearch)
				.queryParam("key", freeKey)
				.toUriString();
		StyleResponse response = restTemplate.getForObject(url, StyleResponse.class);		
		return response.getData();	
	}
	
	//-------------- hop ---------------//

	public List<Hop> findAllHop() {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/hops/")
				.queryParam("key", freeKey)
				.toUriString();
		HopResponse response = restTemplate.getForObject(url, HopResponse.class);		
		System.out.println(url);
		return response.getData();
	}
	
	public Hop findHopById(int hopId) {
		String url = UriComponentsBuilder.fromHttpUrl("http://api.brewerydb.com/v2/hop/" + hopId + "/")
				.queryParam("key", freeKey)
				.toUriString();
		HopSingleResponse response = restTemplate.getForObject(url, HopSingleResponse.class);		
		return response.getData();		
	}
	
}

