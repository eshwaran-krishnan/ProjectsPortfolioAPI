package us.eshwarankrishnan.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String projectId){
        Review review = new Review(reviewBody);
        reviewRepository.insert(review);

        mongoTemplate.update(Projects.class)
                .matching(Criteria.where("projectId").is(projectId))
                .apply(new Update().push("reviewIDs").value(review))
                .first();
        return review;
    }
}
