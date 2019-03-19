package co.finalfour.beerme.entity.beer;

import java.util.Comparator;

public class BeersByLowIbu implements Comparator<Beer>
{
    @Override
    public int compare(Beer a, Beer b)
    {
        
        if (a.getIbu() < b.getIbu())
        {
            return -1;
        }
        
        if (b.getIbu() < a.getIbu())
        {
            return 1;
        } else 
        {
            return 0;  
        }    
    }
}
