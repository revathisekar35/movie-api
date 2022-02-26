package com.techreturners.moviemanager.service;

import com.techreturners.moviemanager.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();

    Review insertReview(Review review);

    Review getReviewById(Long id);

    void updateReviewById(Long id, Review review);

    void deleteReviewById(Long id);
}
