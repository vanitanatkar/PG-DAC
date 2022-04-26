
public class Circle {
    
	private static final float PI=3.1416f;
	private static float radius;
	
	
	public Circle()
	{
		radius=0;
	}
	
	public Circle(int rad)
	{
		radius=rad;
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public static void Area()  
	{ 
		float area;
		area= (PI*radius*radius);
		System.out.println("Area:"+area);
	}
	
	public static void Circumference()
	{ 
		float circumference;
		circumference =2*PI*radius;
		System.out.println("circumference="+circumference);
	}
	public String toString()
	{
		String str= "radius"+radius+"PI"+PI;
		return str;
	}
}
