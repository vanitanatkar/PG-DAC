package study;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;;

public class HibernateDao {
	

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
	

	
	public static List<Product> getAllRowsUsingNative()
	{
		Session session = getSession();
		
		Query<Product> query = session.createNativeQuery("select * from Product_table as s",Product.class);
		//query.setParameter("ID", 101);
		
		return query.list();
	}
	
	
	
	public static void AddProduct(int id,String name, int cost, String desc, int qty, String date ) {
		
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Product prod = new Product(id, name, cost, desc, qty, date);
		session.save(prod);
		t.commit();
		session.close();
	 }
	

	public static void updateProduct(int id,String desc)
	{
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Product prod =session.find(Product.class,id);
		prod.setDesc(desc);
		t.commit(); 
	
	}
	
	
	public static void delete(int id)
	{
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Product obj =session.find(Product.class,id);
		
		if(obj !=null)
			session.delete(obj); //after this removed state
		t.commit();
		
	}

 public static Product ShowProd(int id) {
	 
		Session session = getSession();
		Transaction t = session.beginTransaction();
		Product obj =session.find(Product.class,id);
		
		t.commit();
		
		return obj;
 }

 
}
