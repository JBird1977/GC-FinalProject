package co.finalfour.beerme;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.entity.beer.Ingredient;
import co.finalfour.beerme.entity.beer.Mood;
import co.finalfour.beerme.service.BeerApiService;

@Controller
public class BeerMeController
{
    @Autowired
    private BeerMeDao beerMeDao;
    
    @Autowired
    private BeerApiService beerApiService;
    
    @RequestMapping ("/test")
    public ModelAndView test()
    
    {
    	ModelAndView mav = new ModelAndView("test");
    	List<Brewery> breweries = beerApiService.findBreweries();
    	List<Beer> beers = beerApiService.findBeers();
    	List<Ingredient> ingredients = beerApiService.findIngredientsByBeer(beers.get(0).getId());
    	mav.addObject("breweries", breweries);
    	mav.addObject("beers", beers);
    	mav.addObject("ingredients", ingredients);
        return mav;
    }
    
    @RequestMapping ("/")
    public ModelAndView index()
    {
    	return new ModelAndView("index", "moods", getMoods());
    	
    }
    
    @PostMapping("/results")
    public ModelAndView results(@RequestParam(value="mood")String mood)
    {
    	ModelAndView mav = new ModelAndView("results");
    	//mav.addObject(Mood.class, "moods");
    	return new ModelAndView("results");
    }
    
	
	public List<String> getMoods()
	{
		List<String> moods = new ArrayList<>();
		moods.add("Happy");
		moods.add("Punchy");
		moods.add("Notebook Sad");
		moods.add("Pepe Le Pew Social");	
		return moods;
	}
	
    
}
