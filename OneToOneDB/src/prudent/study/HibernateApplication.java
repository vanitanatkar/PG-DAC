
package prudent.study;


import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.Service;

import Study.entity.Address;
import Study.entity.Employee;
public class HibernateApplication {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory =null;
		
		
        StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
             // Create MetadataSources
             MetadataSources sources = new MetadataSources(registry);
             // Create Metadata
             Metadata metadata = sources.getMetadataBuilder().build();
             // Create SessionFactory
             sessionFactory= metadata.getSessionFactoryBuilder().build();
             Session session = sessionFactory.openSession(); // start a transaction
  
             Transaction transaction = session.beginTransaction();
             Employee e1=new Employee();  //creted Emp object  
             e1.setName("Ravi Malik");    
             e1.setEmail("ravi@gmail.com");    
                 
             Address address1=new Address();    //created Address object
             address1.setAddressLine1("G-21,Lohia nagar");    
             address1.setCity("Ghaziabad");    
             address1.setState("UP");    
             address1.setCountry("India");    
             address1.setPincode(201301);    
                 
       //here Employee me address ka property and address me employee ka property set kiya = One-To-One
             
             e1.setAddress(address1); //emp me Address set kiya   
             address1.setEmployee(e1); //Address me emp set kiya   
                 
             session.save(e1);    
             
             transaction.commit();
             
             
             
	}//end of main
	
	
	
	
}//end of class

		
		
	
	
	
		
		
