package seeandyougo.refactor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import seeandyougo.refactor.domain.Review;
import seeandyougo.refactor.service.ReviewService;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class ReviewController {

        private final ReviewService reviewService;

    @ResponseStatus(HttpStatus.OK)
        @PostMapping("/review")//리뷰등록
        public List<Review> addReview(@RequestBody Review review) {//Model model생략가능 자동으로 넣어주기때문
        reviewService.saveReview(review);
        List<Review> all = reviewService.findAll();
        return all;
        }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/reviewList")//리뷰목록
    public List<Review> getReviewList(){
        List<Review> all = reviewService.findAll();

        return all;
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/reivew") // 리뷰 삭제
    public List<Review> deleteReview(@RequestBody Review review) {
        reviewService.deleteReview(review);
        List<Review> all = reviewService.findAll();

        return all;
    }
}
