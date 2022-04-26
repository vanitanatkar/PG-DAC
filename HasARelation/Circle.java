package Study.HasARelation;

public class Circle {

	private int radius;
	private Point center;


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}

	public Circle() {
		radius=1;
		center=new Point();
	}

	public Circle(int r,Point p)
	{
		radius=r;
		center=p;
	}
	@Override
	public String toString() {
		String circle="Circle: radius="+radius+","+center;
		return circle;
	}
/*	@Override
	public boolean equals(Object obj) {


		if ( obj instanceof Circle)
		{
			Circle temp =(Circle)obj;
			if(( this.radius==temp.radius) && (this.center.getX()==temp.center.getX()) &&(this.center.getY()==temp.center.getY()))
				return true;
			else
				return false;
		}
		else
			return false;
	}*/
	

}
