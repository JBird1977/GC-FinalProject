package co.finalfour.beerme.entity.beer;

import java.util.Comparator;

public class BeersByLowAbvAndLowIbuComparator implements Comparator<Beer>
{
    
    @Override
    public int compare(Beer a, Beer b)
    {
        double comboA = 0.0;
        double comboB = 0.0;
        
        //Awestruck is the lesser average of IBU and ABV
        comboA = ( (a.getAbv() * a.getIbu()) / 2 );
        System.out.println(comboA);
        comboB = ( (b.getAbv() * b.getIbu()) / 2 );
        System.out.println(comboB);
        
        if (comboA < comboB)
        {
            return -1;
        }
        
        if (comboB < comboA)
        {
            return 1;
        } else 
        {
            return 0;  
        }    
    }
}
