package co.finalfour.beerme.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.entity.beer.Adjunct;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.Hop;
import co.finalfour.beerme.entity.beer.Location;
import co.finalfour.beerme.entity.beer.Style;
import co.finalfour.beerme.service.SearchApiService;

@Controller
public class SearchController {
	
	@Autowired
	private SearchApiService searchApiService;
	
	@RequestMapping("/search")
	public ModelAndView search() {
		return new ModelAndView("search");
	}
	
	@RequestMapping("/searchBy") 
	public ModelAndView searchBy(@RequestParam("beerId") String beerId,
			@RequestParam("adjunctId") int adjunctId,
			@RequestParam("brewbeerId") String brewbeerId,
			@RequestParam("hopId") int hopId) {
		ModelAndView mav = new ModelAndView("searchResults");
		
		
		if(!beerId.equalsIgnoreCase("null")) {
			Beer beer = searchApiService.findBeerById(beerId);
			mav.addObject("beer", beer);
		} 
		
		if (adjunctId > 0) {
			Adjunct adjunct = searchApiService.findAdjunctById(adjunctId);
			mav.addObject("adjunct", adjunct);
		}
		if(!brewbeerId.equalsIgnoreCase("null")) {
			List<Brewery> breweries = searchApiService.findBreweriesByBeerId(brewbeerId);
			mav.addObject("breweries", breweries);
		}
		if (hopId > 0) {
			Hop hop = searchApiService.findHopById(hopId);
			mav.addObject("hops", hop);
		}
	
		return mav;
		
	}
	
	//////////////////////// beers ///////////////////////
	
	//------------------ single beer -------------------//
	
	//*****PAIDKEY
	@RequestMapping("/searchBeersByUPC")
	public ModelAndView searchBeerUPC(@PathVariable("code") long code) {
		Beer beer = searchApiService.findBeerByUPC(code);
		return new ModelAndView("searchResults", "beer", beer);
	}
	
	@RequestMapping("/searchResults/beer/{id}/")
	public ModelAndView searchBeerId(@PathVariable("id") String id) {
		Beer beer = searchApiService.findBeerById(id);
		return new ModelAndView("searchResults", "beer", beer);
	}
	
	@RequestMapping("/randomBeer")
	public ModelAndView searchRandomBeer(Beer random) {
		Beer beer = searchApiService.randomBeer(random);
		return new ModelAndView("searchResults", "beer", beer);
	}
	
	//------------------ list of beers -----------------//
	
	@RequestMapping("/searchBeers")
	public ModelAndView searchAllBeers() {
		List<Beer> beers= searchApiService.findAllBeers();
		return new ModelAndView("searchResults", "beers", beers);
	}
	
	////////////////////// breweries //////////////////////
	
	//------------------ single brewery -----------------//
	
	//*****PAIDKEY
	@RequestMapping("/searchGEO")
	public ModelAndView searchBreweriesByGeo(@RequestParam("lat") double lat,
			@RequestParam("lng") double lng,
			@RequestParam("radius") double radius,
			@RequestParam("unit") String unit,
			@RequestParam("withSocialAccounts") char withSocialAccounts,
			@RequestParam("withGuilds") char withGuilds,
			@RequestParam("withAlternateNames") char withAlternateNames) {
		System.out.println("SEARCHING GEO");
		List<Location> locations = searchApiService.findBreweriesByGeo(lat, lng, radius, unit, withSocialAccounts, withGuilds, withAlternateNames);
		return new ModelAndView("searchResults", "locations", locations);
	}
	
	//----------------- list of breweries ----------------//
	
	@RequestMapping("/randomBrewery")
	public ModelAndView searchRandomBrewery(Brewery random) {
		Brewery brewery = searchApiService.randomBrewery(random);
		return new ModelAndView("searchResults", "brewery", brewery);
	}
	
	///////////////////////// other ////////////////////////
	
	@RequestMapping("/searchResults/adjunct/{id}/")
	public ModelAndView searchAdjunctId(@PathVariable("id") int id) {
		Adjunct adjunct = searchApiService.findAdjunctById(id);
		return new ModelAndView("searchResults", "adjunct", adjunct);
	}
	
	@RequestMapping("/searchAdjuncts")
	public ModelAndView searchAllAdjuncts() {
		List<Adjunct> adjuncts=searchApiService.findAllAdjuncts();
		return new ModelAndView("searchResults", "adjuncts", adjuncts);
	}
	
	@RequestMapping("/searchStyle")
	public ModelAndView searchStyle(@RequestParam("styleSearch") String styleSearch) {
		ModelAndView mav = new ModelAndView("searchResults");
		List<Style> styles = searchApiService.searchStyle(styleSearch);
		List<Beer> temp = new ArrayList<>();
		List<Beer> beers = new ArrayList<>();
		for (Style style : styles) {
			temp = searchApiService.beerStyle(style.getId());
			for (Beer b : temp) {
				beers.add(b);
			}
		}
		mav.addObject("search", styleSearch);
		mav.addObject("beers", beers);
		return mav;
	}
	
	@RequestMapping("/searchHops")
	public ModelAndView searchAllHop() {
		List<Hop> hops=searchApiService.findAllHop();
		return new ModelAndView("searchResults", "hops", hops);
	}
	@RequestMapping("/searchResults/hop/{id}/")
	public ModelAndView searchHopId(@PathVariable("id") int id) {
		Hop hop = searchApiService.findHopById(id);
		return new ModelAndView("searchResults", "hops", hop);
	}
	
}
