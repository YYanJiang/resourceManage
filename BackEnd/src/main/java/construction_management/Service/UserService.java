package construction_management.Service;

import construction_management.Entity.User;

public interface UserService {
	User getUser(int id);
	void makeNewUser(User user);
	
}
