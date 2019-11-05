package construction_management.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import construction_management.DAO.UserDAO;
import construction_management.Entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	
	private UserDAO userDAO;
	
	public User getUser(int userId) {
		return userDAO.getUser(userId);
	}
	
	public void makeNewUser(User user) {
		userDAO.makeNewUser(user);
	}

	
}
