package co.finalfour.beerme.entity.beer;

import java.util.Comparator;

public class BeersByLowAbvComparator implements Comparator<Beer>
{

    
    @Override
    public int compare(Beer a, Beer b)
    {
        
        if (a.getAbv() < b.getAbv())
        {
            return -1;
        }
        
        if (b.getAbv() < a.getAbv())
        {
            return 1;
        } else 
        {
            return 0;  
        }    
    }
    
    
}
