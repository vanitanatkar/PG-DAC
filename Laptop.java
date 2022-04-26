package Study.Interface;

public class Laptop implements Sellable {
	//Brand, RAM, display, color , Cost
	private String brand;
	private int RAM;
	private String display;
	private String color;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getColour() {
		return color;
	}

	public void setColour(String colour) {
		this.color = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop() {
		System.out.println("Laptop No parameter constructor called:");
	}

	public Laptop(String brand, int rAM, String display, String colour, double price) {
		super();
		this.brand = brand;
		RAM = rAM;
		this.display = display;
		this.color = colour;
		this.price = price;
	}

	@Override
	public double getSellingPrice() {
		double gsp=price-getDiscount();
		return gsp;
	}

	@Override
	public double getDiscount() {
		double sd=0.10*price;
		return sd;
	}
	@Override
	public String toString() {

		String lp="Laptop:" + brand + ", RAM=" + RAM + ", display=" + display + ", colour=" + color + ", price="
				+ price;
		return lp;
	}


}
