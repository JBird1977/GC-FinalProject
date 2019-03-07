package co.finalfour.beerme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BeerMeController
{
    @Autowired
    private BeerMeDao beerMeDao;
    
}
