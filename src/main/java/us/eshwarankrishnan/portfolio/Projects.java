package us.eshwarankrishnan.portfolio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projects {

    @Id
    private ObjectId id;
    private String websiteName;
    private String projectTitle;
    private String projectWebLink;
    private String projectId;
    private List<Review> reviewIDs;

}
