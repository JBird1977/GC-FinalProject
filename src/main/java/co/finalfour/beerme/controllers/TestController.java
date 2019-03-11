package co.finalfour.beerme.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Beer;

@Controller
public class TestController {

	@Autowired
	private BeerMeDao beerMeDao;
	
	@RequestMapping
	public ModelAndView search() {
		List<Beer> beers=beerMeDao.findAllBeers();
		return new ModelAndView("search", "beers", beers);
	}
	
}
