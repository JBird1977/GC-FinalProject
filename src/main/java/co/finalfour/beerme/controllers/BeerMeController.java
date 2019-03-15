package co.finalfour.beerme.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.Ingredient;
import co.finalfour.beerme.model.Mood;
import co.finalfour.beerme.service.BeerApiService;

@Controller
public class BeerMeController {
	@Autowired
	private BeerMeDao beerMeDao;

	@Autowired
	private BeerApiService beerApiService;

	@RequestMapping("/test")
	public ModelAndView test()

	{
		ModelAndView mav = new ModelAndView("test");
		List<Brewery> breweries = beerApiService.findBreweries();
		List<Beer> beers = beerApiService.findBeers();
		List<Ingredient> ingredients = beerApiService.findIngredientsByBeer("WHQisc");
		mav.addObject("breweries", breweries);
		mav.addObject("beers", beers);
		mav.addObject("ingredients", ingredients);
		return mav;
	}

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("moods", getMoods());
		mav.addObject("beerStyles", getBeerStyle());
		return mav;

	}

	@PostMapping("/results")
	public ModelAndView results(@RequestParam(value = "zip", required = false) String zip,
			@RequestParam(value = "locality", required = false) String locality,
			@RequestParam(value = "region", required = false) String region,
			@ModelAttribute("beerStyles") String beerStyles, @ModelAttribute("moods") String moods)

	{
		ModelAndView mav = new ModelAndView("results");
		// Testing using a map.
		List<Beer> beersByBrewery = null;
		// List<Beer> beerId = null;
		String breweryIdContainer = "";
		System.out.println(beerStyles);
		List<Brewery> breweries = beerApiService.findBreweriesByLocation(zip, locality, region);
		Map<String, List<Beer>> test = new HashMap<>();
		for (int i = 0; i < breweries.size(); i++) {
			Brewery brewery = breweries.get(i);
			breweryIdContainer = breweries.get(i).getBreweryIdString();
			beersByBrewery = beerApiService.findBeersByBreweries(brewery.getBreweryIdString());
			System.out.println("Brewery ID String: " + brewery.getBreweryIdString());
			test.put(breweryIdContainer, beersByBrewery);
		}

//       for(int i = 0; i < breweries.size(); i++) {
//    		   breweryIdList.add(breweries.get(i).getBreweryIdString());
//    		   
//       		}
//        
		// List<Brewery> beersByBrewery =
		// beerApiService.findBeersByBreweries(breweryIdList.get(0));
		mav.addObject("mapOfBeerBrew", test);
		// mav.addObject("breweryIdList",breweryIdList);
		mav.addObject("brewery", breweries);
		// mav.addObject("beersByBrewery",beersByBrewery);

		return mav;
	}

	public List<String> getMoods() {
		List<String> moods = new ArrayList<>();
		moods.add("Happy");
		moods.add("Punchy");
		moods.add("Notebook Sad");
		moods.add("Social Butterfly");
		return moods;
	}

	public List<String> getBeerStyle() {
		List<String> beerStyles = new ArrayList<>();
		beerStyles.add("Belgian And French Origin Ales");
		beerStyles.add("British Origin Ales");
		beerStyles.add("German Origin Ales");
		beerStyles.add("North American Origin Ales");
		beerStyles.add("European-germanic Lager");
		beerStyles.add("North American Lager");
		beerStyles.add("Other Lager");
		beerStyles.add("Mead, Cider, & Perry");
		beerStyles.add("Hybrid/mixed Beer");
		return beerStyles;
	}
//	@RequestMapping("/details/{name}")
//	public ModelAndView details(@PathVariable("name") String name) {
//		ModelAndView mav = new ModelAndView("details");
//		List<Beer> beers = beerApiService.findBeers();
//		List<Brewery> breweries = beerApiService.findBreweries();
//		mav.addObject("beers", beers);
//		mav.addObject("breweries",breweries);
//		return mav;

	// }
	@RequestMapping("/details/{breweryIdString}")
	// public ModelAndView details2(@PathVariable("name") String name,
	// @RequestParam(value="breweryIdString", required=false) String
	// breweryIdString)
	public ModelAndView details2(@PathVariable("breweryIdString") String breweryIdString,
			@RequestParam(value = "zip", required = false) String zip,
			@RequestParam(value = "locality", required = false) String locality,
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "true", required = false) Map<String, List<Beer>> test,
			@ModelAttribute("beerStyles") String beerStyles, @ModelAttribute("moods") String moods)

	{
		ModelAndView mav = new ModelAndView("details");
		List<Beer> beers = beerApiService.findBeers();
		List<Beer> breweries2 = beerApiService.findBeersByBreweries(breweryIdString);
		//List<Brewery> breweries = beerApiService.findBreweriesByLocation(zip, locality, region);
		List<Beer> beersByBrewery = beerApiService.findBeersByBreweries(breweryIdString);

		// List<Beer> beerId = null;
//		String breweryIdContainer = "";
//		Map<String, List<Beer>> test = new HashMap<>();
//		for (int i = 0; i < breweries.size(); i++) {
//			Brewery brewery = breweries.get(i);
//			breweryIdContainer = breweries.get(i).getBreweryIdString();
//			beersByBrewery = beerApiService.findBeersByBreweries(brewery.getBreweryIdString());			
//		//System.out.println("Brewery ID String: " + brewery.getBreweryIdString());	
//		test.put(breweryIdContainer, beersByBrewery);
//		}
		mav.addObject("beers", beers);
		mav.addObject("breweries", breweries2);
		mav.addObject("beersByBrewery", beersByBrewery);
		return mav;

	}
//	@RequestMapping("/searchStyle")
//    public ModelAndView searchStyle(@RequestParam("styleSearch") String styleSearch) {
//        List<Style> styles = searchApiService.randomStyle(styleSearch);
//        return new ModelAndView("searchResults", "styles", styles);
//    }
}