package co.finalfour.beerme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.service.BeerApiService;

@Controller
public class BeerMeController
{
    @Autowired
    private BeerMeDao beerMeDao;
    
    @Autowired
    private BeerApiService beerApiService;
    
    @RequestMapping
    public ModelAndView index()
    {
    	ModelAndView mav = new ModelAndView("index");
    	List<Brewery> breweries = beerApiService.findBreweries();
    	List<Beer> beers = beerApiService.findBeers();
    	mav.addObject("breweries", breweries);
    	mav.addObject("beers", beers);
        return mav;
    }
}
