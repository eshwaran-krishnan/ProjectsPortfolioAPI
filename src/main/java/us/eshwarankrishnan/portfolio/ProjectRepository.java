package us.eshwarankrishnan.portfolio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<Projects, ObjectId> {
    Optional<Projects> findProjectsByProjectId(String projectID);
}
