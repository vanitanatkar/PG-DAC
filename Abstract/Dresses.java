package Study.Abstract;

public class Dresses extends Product {
	private String dressname;
	private	String material;
	private char size;
	private  float price;
	

	public Dresses()
	{
		System.out.println("Dresses No parameter Consructor Called:");
		
	}
	
	public Dresses(String dressname, String material, char size,float price ) {
		super();
		this.dressname = dressname;
		this.material = material;
		this.price = price;
		this.size = size;
	}

	public String getDressname() {
		return dressname;
	}

	public void setDressname(String dressname) {
		this.dressname = dressname;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
	

	@Override
	public double getDesc() {
		double dc=0.10*price;
		return dc;
	}

	@Override
	public double getFinalCost() {
		double gfc=price-getDesc();
		return gfc;
	}
	@Override
	public String toString() {
		String Dresses="[ DressName: "+dressname+", Material: "+material+", Price: "+price+", Size: "+size+" ]";
		return Dresses;
	}
}
