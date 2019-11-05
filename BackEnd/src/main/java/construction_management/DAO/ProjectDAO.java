package construction_management.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import construction_management.Entity.Projects;
import construction_management.Entity.User;

/**
 * Hello world!
 *
 */
public class ProjectDAO 
{
//    public static void main( String[] args )
//    {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
    public void ProjectsInitialization() {	
    	Projects pj1= new Projects();
    	pj1.setId(1);
        pj1.setName("Project1");
    	Projects pj2= new Projects();
    	pj2.setId(2);
        pj2.setName("Project2");
    	Projects pj3= new Projects();
    	pj3.setId(3);
        pj3.setName("Project3");
        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Projects.class);
//        SessionFactory sf = con.buildSessionFactory();
//        Session session = sf.openSession();
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(pj1);
        session.save(pj2);
        session.save(pj3);
        tx.commit();
        System.out.print("project add successfully");
    }
    
 	public Projects getProject(int pId) {
		Session session = this.sessionFactory.openSession();
		Projects result = (Projects)session.createQuery("from Projects where projectId = ${projectId}").getSingleResult();
		session.close();
		return result;
	}
}	
