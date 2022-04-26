package Study.HasARelation;

public class MyDate {
	private int day,month,year;


	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public MyDate()
	{
		day=00;
		month=00;
		year=00;
	}

	public MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	@Override
	public boolean equals(Object obj) {


		if ( obj instanceof MyDate)
		{
			MyDate temp =(MyDate)obj;
			if(( this.day==temp.day) && (this.month==temp.month) && (this.year==temp.year))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String date="Date:"+day+"/"+month+"/"+year;
		return date; 
	}

}

