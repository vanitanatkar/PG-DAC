package Study.entity;

import javax.persistence.*;  
  
@Entity 
@Table(name="emp220")  
public class Employee {    
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @PrimaryKeyJoinColumn  
private int employeeId;    
private String name,email;

@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL) //cascade means if emp delete adress also delete 
private Address address;//here we pass Address object during insert but in table emp only Address_id will update.. 



public int getEmployeeId() {  
    return employeeId;  
}  
public void setEmployeeId(int employeeId) {  
    this.employeeId = employeeId;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public Address getAddress() {  
    return address;  
}  
public void setAddress(Address address) {  
    this.address = address;  
}    
  
} 