package study;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import study.Student;

public class HiberDao {

	public static void main(String[] args) {

		 //Session session = getSession();
	
		 //getAllRows().stream().forEach((row)->{System.out.println(row);} );
		getAllRowsUsingNative().stream().forEach((row)->{System.out.println(row);} );
		 //update(session);
		 //delete(session);
		       
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

public static List<Student> getAllRows()
{
	
	Session session = getSession();
	//Query<StudentEntity> query = session.createQuery("from study.entity.StudentEntity");
	//Query<StudentEntity> query = session.createQuery("from study.entity.StudentEntity as s where s.rollNumber < 100");
	
	//using placeholders in where clause
	Query<Student> query = session.createQuery("from study.entity.StudentEntity as s where s.rollNumber < :maxroll ");
	query.setParameter("maxroll", 100);
	return query.list();
	
}
public static List<Student> getAllRowsUsingNative()
{
	Session session = getSession();
	//Query<StudentEntity> query = session.createNativeQuery("select * from iet_student",StudentEntity.class);
	//using placeholders in where clause
	Query<Student> query = session.createNativeQuery("select * from iet_student as s where s.roll_number < :maxroll ",Student.class);
	query.setParameter("maxroll", 100);
	
	return query.list();
}

/*

public static void update(Session session)
{
	session.beginTransaction();
	
	//here the object is auto filled with all columns as it is from db
	Student fromDb = session.find(Student.class,99);//PERSISTENT 

	//we may change one or two columns
	fromDb.setName("prachee");
	
	/* NOT recommended = if we dont set all columns then the unset columns also get updated as null
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

public static void addStudent(int roll_no,String name) {

	Session session = getSession();
	Transaction t = session.beginTransaction();
	
	Student stud = new Student(roll_no, name);
	session.save(stud);	

	t.commit();
	
}
*/
}




