package co.finalfour.beerme.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.finalfour.beerme.entity.beer.Beer;
import co.finalfour.beerme.entity.beer.Brewery;

@Repository
@Transactional
public class BeerMeDao
{
    @PersistenceContext
    private EntityManager em;
    
    //////////////////////////// BREWERIES /////////////////////////////////////////
	public List<Brewery> findAllBreweries() {
		return em.createQuery("FROM Brewery", Brewery.class).getResultList();
	}
	
	public List<Brewery> findBreweryByName(String breweryName) {
		return em.createQuery("FROM Brewery WHERE name LIKE :breweryName", Brewery.class)
				.setParameter("name", "%" + breweryName + "%").getResultList();
	}
	
	public List<Brewery> findBreweriesByBeer(Beer beer) {
		return em.createQuery("from Brewery where beer = :beer order by name", Brewery.class)
				.setParameter("beer", beer)
				.getResultList();
	}
	
	public List<Brewery> findBreweriesByBeerId(Long beerId) {
		//************* link beers with brewery
		return em.createQuery("FROM Brewery WHERE beer_id = :beerId", Brewery.class)
				.setParameter("beerId", beerId)
				.getResultList();
	}

	public void createBrewery(Brewery brewery) {
		em.persist(brewery);
	}

	public Brewery findBreweryById(Long id) {
		return em.find(Brewery.class, id);
	}

	public void updateBrewery(Brewery brewery) {
		em.merge(brewery);
	}
	
	public void updateBrewery(Long breweryId) {
		Brewery brewery = new Brewery();
		brewery = em.find(Brewery.class, breweryId);
		em.merge(brewery);
	}

	public void deleteBrewery(Long id) {
		Brewery brewery = em.getReference(Brewery.class, id);
		em.remove(brewery);
		em.flush();
	}
	
	public void delete(Brewery brewery) {
		em.remove(em.contains(brewery) ? brewery : em.merge(brewery));
		em.flush();
	}

	public boolean breweryContains(Brewery brewery) {
		return em.contains(brewery);
	}
	///////////////////////////////// BEER //////////////////////////////////////////////
	public List<Beer> findAllBeers() {
		return em.createQuery("FROM Beer", Beer.class).getResultList();
	}
	
	public List<Beer> findBeerByName(String beerName) {
		return em.createQuery("FROM Beer WHERE name LIKE :beerName", Beer.class)
				.setParameter("name", "%" + beerName + "%")
				.getResultList();
	}
	
	public List<Beer> findBeerByBrewery(Brewery brewery) {
		return em.createQuery("FROM Beer WHERE brewery = :brewery order by name", Beer.class)
				.setParameter("brewery", brewery)
				.getResultList();
	}
	
	public List<Beer> findBeerByBreweryId(Long breweryId) {
		//***************link beers and breweries
		return em.createQuery("FROM Beer WHERE brewery_id = :breweryId", Beer.class)
				.setParameter("breweryId", breweryId)
				.getResultList();
	}

	public void createBeer(Beer beer) {
		em.persist(beer);
	}

	public Beer findBeerById(Long id) {
		return em.find(Beer.class, id);
	}
	
	public Beer findBeerById(String objectBeerId) {
		return em.find(Beer.class, objectBeerId);
	}

	public void updateBeer(Beer beer) {
		em.merge(beer);
	}
	
	public void updateBeer(Long beerId) {
		Beer beer = new Beer();
		beer = em.find(Beer.class, beerId);
		em.merge(beer);
	}

	public void deleteBeer(Long beerId) {
		Beer beer = em.getReference(Beer.class, beerId);
		em.remove(beer);
	}
	
	public void deleteBeer(Beer beer) {
		em.remove(em.contains(beer) ? beer : em.merge(beer));
	}

	public boolean beerContains(Beer beer) {
		return em.contains(beer);
	}

}
