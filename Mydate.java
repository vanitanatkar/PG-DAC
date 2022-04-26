class MyDate
{
	private int days;
	private int months;
	private int years;

	private MyDate()
	{
		days = 00;
		months = 00;
		years = 00;
		//Prevent default constructor
	}

	public MyDate(int DD,int MM,int YY)
	{
		days=DD;
		months=MM;
		years=YY;
	}

	public int getDays()
	{
		return days;
	}
	public void setDays(int DD )
	{
		days=DD;
	}


	public int getMonths()
	{
		return months;
	}
	public void setMonths(int MM)
	{
		months=MM;
	}


	public int getYears()
	{
		return years;
	}
	public void setYears(int YY)
	{
		years=YY;
	}


	public String toString()
	{
		return years + " Years, " + months + " Months, " + days + " Days";
	}
}