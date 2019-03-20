package co.finalfour.beerme.entity.beer;

import java.util.Comparator;

public class BeersByHighAbvAndLowIbuComparator implements Comparator<Beer>
{
    @Override
    public int compare(Beer a, Beer b)
    {
        double comboA = 0.0;
        double comboB = 0.0;
        
        //Social Butterfly consists of low Ibu beers with high Abv. 
        //We use the equation below to generate a score
        //the higher the score the better the fit for the mood and the higher
        //it places in the list of recommendations
        comboA = ((a.getAbv() - (a.getIbu()) / 3));
        System.out.println("Combo A: " + comboA);
        comboB = ((b.getAbv() - (b.getIbu()) / 3 ));
        System.out.println("Combo B: " + comboB);
        
        if (comboA < comboB)
        {
            return 1;
        }
        
        if (comboB < comboA)
        {
            return -1;
        } else 
        {
            return 0;  
        }    
    }
}
