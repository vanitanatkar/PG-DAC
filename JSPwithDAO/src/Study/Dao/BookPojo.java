package Study.Dao;

public class BookPojo {
	
	private int id,cost;
	private String name;
	
	public BookPojo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookPojo(int id, int cost, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return "BookPojo [id=" + id + ", cost=" + cost + ", name=" + name + "]";
	}

}
