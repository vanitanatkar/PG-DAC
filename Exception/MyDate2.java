package Study.Exception;

public class MyDate2 {
	int day;
	int month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
			System.out.println("Enterd day is rigth:"+day);
		}
		else {
			throw new WrongDayException(); }
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) throws WrongMonthException {
		if(month>=1 && month<=12) {
			this.month = month;
			System.out.println("Entered month is right:"+month);}
		else {
			throw new WrongMonthException(); }
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate2(int day, int month, int year)   {
		if(day>=1 && day<=31) {
			this.day = day;
			System.out.println("Enterd day is rigth:"+day);	}
		else {
			throw new WrongDayException();}  	

		if(month>=1 && month<=12) {
			this.month = month;
			System.out.println("Entered month is right:"+month);}
		else {
			  throw new WrongMonthException(); }

		this.year = year;
	}
	public MyDate2() {
		System.out.println("MyDate2 No Paramerter Constructor Called:");
	}
	@Override
	public String toString() {
		return "MyDate2 [day=" + day + ", month=" + month + ", year=" + year + "]";
	}


}
