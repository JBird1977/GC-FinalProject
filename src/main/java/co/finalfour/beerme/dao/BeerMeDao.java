package co.finalfour.beerme.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class BeerMeDao
{
    @PersistenceContext
    private EntityManager em;

}
