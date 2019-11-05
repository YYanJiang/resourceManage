package construction_management.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Projects {	
	
	@Id
	@Column(name = "projectId")
	private int pid;
	
	@Column(name = "projectName")
	private String pname;

	public int getId() {
		return pid;
	}

	public void setId(int id) {
		this.pid = id;
	}

	public String getName() {
		return pname;
	}

	public void setName(String name) {
		this.pname = name;
	}
	
}
