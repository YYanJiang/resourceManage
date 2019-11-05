package construction_management.DAO;
import construction_management.Entity.User;

public interface UserDAO {
	public User getUser(int userId);
	public void makeNewUser(User user);
}
