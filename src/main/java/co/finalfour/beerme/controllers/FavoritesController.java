package co.finalfour.beerme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;
import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;
import co.finalfour.beerme.service.BeerApiService;

@Controller
public class FavoritesController {
	
    @Autowired
    private BeerMeDao beerMeDao;
    
    @Autowired
    private BeerApiService beerApiService;
    
    @RequestMapping("/favorites")
	public ModelAndView viewFavorites(@ModelAttribute("action") String action,
			@ModelAttribute("name") String name) {
		List<Beer> beers = beerMeDao.findAllBeers();
		List<Brewery> breweries = beerMeDao.findAllBreweries();
		if (beers.isEmpty() && breweries.isEmpty()) {
			return new ModelAndView("empty");
		} else {
			ModelAndView mav = new ModelAndView("favorites");
			mav.addObject("beers", beers);
			mav.addObject("breweries", breweries);
			mav.addObject("action", action);
			mav.addObject("name", name);
			return mav;
		}
    }
    
	@RequestMapping("/{fave}/{id}/add")
	public ModelAndView addFavoriteBeer(@PathVariable("id") String id,
			@PathVariable("fave") String fave) {
		
		ModelAndView mav = new ModelAndView("redirect:/favorites");
		String action = "added";
		String name = "";
		
		if (fave.equalsIgnoreCase("beer")) {
			Beer beer = new Beer();
			beer = beerApiService.findBeerById(id);
			if (!beerMeDao.beerHas(id)) {
				beerMeDao.createBeer(beer);
			} else {
				action = "already added";
			}
			name = beer.getName();
		} else if (fave.equalsIgnoreCase("brewery")) {
			Brewery brewery = new Brewery();
			brewery = beerApiService.findBreweryById(id);
			if (!beerMeDao.breweryHas(id)) {
				beerMeDao.createBrewery(brewery);
			} else {
				action = "already added";
			}
			name = brewery.getName();			
		}
		
		mav.addObject("name", name);
		mav.addObject("action", action);
		return mav;
	}
	
	@RequestMapping("/beer/{id}/{rating}/ratingUpdate")
	public ModelAndView updateFavoriteBeerRating(@PathVariable("id") Long beerId,
			@PathVariable("rating") Integer rating) {
		Beer beer = new Beer();
		beer = beerMeDao.findBeerById(beerId);
		if (rating == 0) {
			beer.setRating(null);
		} else {
			beer.setRating(rating);
		}
		beerMeDao.updateBeer(beer);
		return new ModelAndView("redirect:/favorites");
	}
    
	@RequestMapping("/beer/{id}/delete")
	public ModelAndView deleteFavoriteBeer(@PathVariable("id") Long beerId) {
		Beer beer = new Beer();
		beer = beerMeDao.findBeerById(beerId);
		beerMeDao.deleteBeer(beerId);
		String action = "deleted";
		String name = beer.getName();
		ModelAndView mav = new ModelAndView("redirect:/favorites");
		mav.addObject("name", name);
		mav.addObject("action", action);
		return mav;
	}
	
//	@RequestMapping("/brewery/{id}/add")
//	public ModelAndView addFavoriteBrewery(@PathVariable("id") String objectBreweryId) {
//		Brewery brewery = new Brewery();
//		brewery = beerApiService.findBreweryById(objectBreweryId);
//		if (!beerMeDao.breweryContains(brewery)) {
//			beerMeDao.createBrewery(brewery);
//		}
//		String action = "added";
//		String name = brewery.getName();
//		ModelAndView mav = new ModelAndView("redirect:/favorites");
//		mav.addObject("name", name);
//		mav.addObject("action", action);
//		return mav;
//	}
	
	@RequestMapping("/brewery/{id}/{rating}/ratingUpdate")
	public ModelAndView updateFavoriteBreweryRating(@PathVariable("id") Long breweryId,
			@PathVariable("rating") Integer rating) {
		Brewery brewery = new Brewery();
		brewery = beerMeDao.findBreweryById(breweryId);
		if (rating == 0) {
			brewery.setRating(null);
		} else {
			brewery.setRating(rating);
		}
		beerMeDao.updateBrewery(brewery);
		return new ModelAndView("redirect:/favorites");
	}
    
	@RequestMapping("/brewery/{id}/delete")
	public ModelAndView deleteFavoriteBrewery(@PathVariable("id") Long breweryId) {
		Brewery brewery = new Brewery();
		brewery = beerMeDao.findBreweryById(breweryId);
		beerMeDao.deleteBrewery(breweryId);
		String action = "deleted";
		String name = brewery.getName();
		ModelAndView mav = new ModelAndView("redirect:/favorites");
		mav.addObject("name", name);
		mav.addObject("action", action);
		return mav;
	}

}
