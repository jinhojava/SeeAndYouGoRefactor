package seeandyougo.refactor.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import seeandyougo.refactor.domain.Review;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepository {

    private final EntityManager em;

    public void save(Review review){
        em.persist(review);
    }

    public void Delete(Review review){
        em.remove(review);
    }

    public List<Review> findAll(){
        return em.createQuery("select r from Review r", Review.class)
                .getResultList();
    }
}
