package co.finalfour.beerme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.finalfour.beerme.dao.BeerMeDao;

@Controller
public class BeerMeController
{
    @Autowired
    private BeerMeDao beerMeDao;
    
    @RequestMapping
    public ModelAndView index()
    {
        return new ModelAndView("index");
    }
}
