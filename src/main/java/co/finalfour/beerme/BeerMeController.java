package co.finalfour.beerme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.finalfour.beerme.dao.BeerMeDao;

@Controller
public class BeerMeController
{
    @Autowired
    private BeerMeDao beerMeDao;
    
}
