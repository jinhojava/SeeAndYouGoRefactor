package seeandyougo.refactor.service;

import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.MemberSubstitution;
import org.springframework.stereotype.Service;
import seeandyougo.refactor.domain.Review;
import seeandyougo.refactor.repository.ReviewRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public void saveReview(Review review){
        reviewRepository.save(review);
    }

    public List<Review> findAll(){
        List<Review> all = reviewRepository.findAll();
        return all;
    }

    public void deleteReview(Review review){
        reviewRepository.Delete(review);
    }
}
