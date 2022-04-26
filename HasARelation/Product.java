package Study.HasARelation;

public class Product {
	//Properties -  productName, desc, cost , dateOfExpiry
	private String productname;
	private String description;
	private int cost;
	private MyDate DOE;

	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public MyDate getDOE() {
		return DOE;
	}
	public void setDOE(MyDate dOE) {
		DOE = dOE;
	}

	public Product()
	{
		productname="";
		description="";
		cost=00;
		DOE = new MyDate();
	}
	public Product(String pn,String dsc,int ct,MyDate d)
	{
		productname=pn;
		description=dsc;
		cost=ct;
		DOE = d;
	}
	@Override
	public boolean equals(Object obj) {
		
		
		if ( obj instanceof Product)
		{
		    Product temp =(Product)obj;
		   if(( this.productname==temp.productname) && (this.description==temp.description) && (this.cost==temp.cost) &&(this.DOE.getDay()==temp.DOE.getDay())&&(this.DOE.getMonth()==temp.DOE.getMonth()) &&(this.DOE.getYear()==temp.DOE.getYear()))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	public String toString() {
		String str=" ";
		str="productname: "+productname+"   description: "+description+"  cost: "+cost+"  DOE:"+DOE;
		return str;
	}
}


