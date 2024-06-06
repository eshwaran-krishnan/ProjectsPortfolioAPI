package us.eshwarankrishnan.portfolio;

import lombok.Getter;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping
    public ResponseEntity<List<Projects>> getAllProjects(){
        return new ResponseEntity<List<Projects>>(projectService.allProjects(), HttpStatus.OK);
    }
    @GetMapping("/{projectId}")
    public ResponseEntity<Optional<Projects>> getSingleProject(@PathVariable String projectId){
        return new ResponseEntity<Optional<Projects>>(projectService.singleProject(projectId), HttpStatus.OK);
    }
}
