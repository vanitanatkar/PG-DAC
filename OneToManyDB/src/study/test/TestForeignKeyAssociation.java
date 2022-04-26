package study.test;


	import study.AccountEntity;
	import study.EmployeeEntity;
	
	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	 
	public class TestForeignKeyAssociation
	{
	 
	    public static void main(String[] args)
	    {
		SessionFactory sessionFactory =null;
			
			
	        StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
	             // Create MetadataSources
	             MetadataSources sources = new MetadataSources(registry);
	             // Create Metadata
	             Metadata metadata = sources.getMetadataBuilder().build();
	             // Create SessionFactory
	             sessionFactory= metadata.getSessionFactoryBuilder().build();
	    
	      Session session = sessionFactory.openSession();
	        session.beginTransaction(); //up here table created .. in mysql check desc Account & desc emp
	 
			
			  AccountEntity account1 = new AccountEntity();
			  account1.setAccountNumber("Account detail 1");
			  
			  AccountEntity account2 = new AccountEntity();
			  account2.setAccountNumber("Account detail 2");
			  
			  AccountEntity account3 = new AccountEntity();
			  account3.setAccountNumber("Account detail 3");
			  
			  //Add new Employee object 
			  EmployeeEntity firstEmployee = new EmployeeEntity(); 
			  firstEmployee.setEmail("demo-user-first@mail.com");
			  firstEmployee.setFirstName("demo-one");
			  firstEmployee.setLastName("user-one");
			  
			  EmployeeEntity secondEmployee = new EmployeeEntity();
			  secondEmployee.setEmail("demo-user-second@mail.com");
			  secondEmployee.setFirstName("demo-two");
			  secondEmployee.setLastName("user-two");
			  
			  Set<AccountEntity> accountsOfFirstEmployee = new HashSet<AccountEntity>();
			  accountsOfFirstEmployee.add(account1); 
			  accountsOfFirstEmployee.add(account2);
			  
			  Set<AccountEntity> accountsOfSecondEmployee = new HashSet<AccountEntity>();
			  accountsOfSecondEmployee.add(account3);
			  
			  firstEmployee.setAccounts(accountsOfFirstEmployee);
			  secondEmployee.setAccounts(accountsOfSecondEmployee); //Save Employee
			  
			  session.save(firstEmployee); 
			  session.save(secondEmployee);
			  
			  
			 
		
			  EmployeeEntity ee =session.find(EmployeeEntity.class,1);//Here we search for Id=1 emp details
			  System.out.println(ee.getFirstName());//here we priSnt that details
			  
			  ee.getAccounts().stream().forEach((a)->{System.out.println(a.getAccountId());});
			  //here emp having many accounts so that account id will  print
			  
		     session.delete(ee); //Here relates details get deleted
			  
			 
			 session.getTransaction().commit();    
			  
	    }
	}


