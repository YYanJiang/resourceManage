package construction_management.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;

import construction_management.Entity.Projects;
import construction_management.Service.ProjectService;

@Controller
public class ProjectController {
	
private ProjectService ProjectService;
	
	@GetMapping("/Project/{projectId}")
	public ResponseEntity<Projects> get(@PathVariable("projectId") int id){
		Projects pj = ProjectService.getProject(id);
		
		return ResponseEntity.ok().body(pj);
	}
}
