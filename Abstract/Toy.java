package Study.Abstract;

public class Toy extends Product {
	String name;
	String category;
	float cost;
	
	public Toy()
	{
		System.out.println("Toy No parameter constructor called:");
	}
	public Toy(String name,String category,float cost)
	{
		this.name=name;
		this.category=category;
		this.cost=cost;
		//System.out.println(" Toy parameter constructor called:");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public double getFinalCost() {
		double gfc=cost-getDesc();	
		return cost;
	}
	
	@Override
	public double getDesc() {
		double dc=0.5*cost;
		return dc;
	}
	@Override
	public String toString() {
		String toy="[ Toyname: "+name+", category: "+category+", cost: "+cost+" ]";
		return toy;
	}

}
