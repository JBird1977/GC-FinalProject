package co.finalfour.beerme;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.Beer;
import co.finalfour.beerme.entity.Brewery;
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
    	List<Brewery> breweries = beerApiService.findBreweries();
    	System.out.println("CONTROLLER BREWERIES = " + breweries);
        return new ModelAndView("index", "breweries", breweries);
    }
}
