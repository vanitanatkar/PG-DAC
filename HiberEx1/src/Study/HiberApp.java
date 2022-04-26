package Study;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HiberApp {

public static void main(String[] args) {
	
	
	 Session session = getSession();
	 delete(session);
	 update(session);
}
		

public static Session getSession()
{
	//READING the hibernate.cfg.xml  from the classpath 
	  StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
    // Create MetadataSources
    MetadataSources sources = new MetadataSources(registry);
    // Create Metadata
    Metadata metadata = sources.getMetadataBuilder().build();
    // Create SessionFactory
    SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();
   
    Session session = sessionFactory.openSession(); // start a transaction
	
    return session;
}
	


public static void update(Session session)
{
	session.beginTransaction();
	
	//here the object is auto filled with all columns as it is from db
	Student fromDb = session.find(Student.class,99);//PERSISTENT 

	//we may change one or two columns
	fromDb.setName("prachi");
	
	/* NOT recommended = if we dont set all columns then the unset columns also get updated as null*/
	//StudentEntity trobj = new StudentEntity(4,"praci");
	//session.saveOrUpdate(trobj);
	
	session.getTransaction().commit(); //reflected in db
}
	

public static void delete(Session session)
{
	Transaction t = session.beginTransaction();
	
	Student obj = session.find(Student.class, 4); //Persistent 
	if(obj !=null)
		session.delete(obj); //after this removed state
	
	t.commit();
	
}


}




