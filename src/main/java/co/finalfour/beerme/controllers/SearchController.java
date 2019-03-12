package co.finalfour.beerme.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Adjunct;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.service.BeerApiService;
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
			@RequestParam("brewbeerId") String brewbeerId) {
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
		return mav;
		
	}
	
	@RequestMapping("/searchBeers")
	public ModelAndView searhAllBeers() {
		List<Beer> beers= searchApiService.findAllBeers();
		return new ModelAndView("searchResults", "beers", beers);
	}
	
	@RequestMapping("/searchResults/beer/{id}/")
	public ModelAndView searchBeerId(@PathVariable("id") String id) {
		Beer beer = searchApiService.findBeerById(id);
		return new ModelAndView("searchResults", "beer", beer);
	}
	@RequestMapping("/searchAdjuncts")
	public ModelAndView searhAllAdjuncts() {
		List<Adjunct> adjuncts=searchApiService.findAllAdjuncts();
		return new ModelAndView("searchResults", "adjuncts", adjuncts);
	}
	
	@RequestMapping("/searchResults/adjunct/{id}/")
	public ModelAndView searchAdjunctId(@PathVariable("id") int id) {
		Adjunct adjunct = searchApiService.findAdjunctById(id);
		return new ModelAndView("searchResults", "adjunct", adjunct);
	}
	
}
