package construction_management.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import construction_management.Entity.User;

public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public User getUser(int userId) {
		Session session = this.sessionFactory.openSession();
		User result = (User)session.createQuery("from Users where userId = ${userId}").getSingleResult();
		session.close();
		return result;
	}

	public void makeNewUser(User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(user);
		tx.commit();
		session.close();
		
	}
	

}
