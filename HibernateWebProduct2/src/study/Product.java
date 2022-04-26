package study;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Product_table") 
public class Product {
	
	
	@Id
	@Column (name="id")
	private int id;
	@Column (name="name")
	 private String name;
	
	@Column (name="cost")
	 private int cost;
	
	@Column (name="desc1")
	 private String desc;
	
	@Column (name="qty")
	private int qty;
	
	@Column (name="date")
	 private String date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Product(int id, String name, int cost, String desc, int qty, String date) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.desc = desc;
		this.qty = qty;
		this.date = date;
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", desc=" + desc + ", qty=" + qty + ", date="
				+ date + "]";
	}
	


}
