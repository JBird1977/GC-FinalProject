package co.finalfour.beerme.entity.beer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class BreweryComparator implements Comparator<Brewery>
{

    private Map<String, List<Beer>> beerMap;

    public BreweryComparator(Map<String, List<Beer>> beerMap)
    {
        this.beerMap = beerMap;
    }

    @Override
    public int compare(Brewery a, Brewery b)
    {
        int totalA = 0;
        int totalB = 0;
       totalA= beerMap.get(a.getBreweryIdString()).size();
       totalB= beerMap.get(b.getBreweryIdString()).size();
        
       if (totalA > totalB)
       {
           return -1;
       }
       if (totalB > totalA)
       {
           return 1;
       }
       else 
       {
        return 0;
       }
       
    }

}
