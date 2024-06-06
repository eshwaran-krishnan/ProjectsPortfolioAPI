package us.eshwarankrishnan.portfolio;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    public List<Projects> allProjects(){
        return projectRepository.findAll();
    }
    public Optional<Projects> singleProject(String projectId){
        return projectRepository.findProjectsByProjectId(projectId);
    }
}
