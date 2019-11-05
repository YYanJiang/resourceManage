package construction_management.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import construction_management.DAO.ProjectDAO;
import construction_management.Entity.Projects;

@Service
@Transactional
public class ProjectService{

	private ProjectDAO ProjectDAO;
	
	public Projects getProject(int pId) {
		return ProjectDAO.getProject(pId);
	}

}
