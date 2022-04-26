
public class Studentbook {

	private String bkname;
	private  String ISBN;
	private int price;


	public Studentbook(String n,int pc)
	{
		bkname=n;
		price =pc;
	}

	public Studentbook(String n,int pc,String bm)
	{
		bkname=n;
		price =pc;
		ISBN=bm;

	}

	public String toString()
	{
		String str= "bkname:" +bkname+",price:" +price+",ISBN:"+ISBN;
		return str;
	}




}
