
public class Address {
	private int flatNo;
	private String bldName;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	public Address()
	{ 
		flatNo=1234;
		bldName="xyz";
		area="cam";
		city="Pune";
		state="Maharastra";
		country="India";
		pincode= 56789;
	}
	
	public Address(int f,String bn,String a,String c,String s,String cnt,int p)
	{ 
		flatNo=f;
		bldName=bn;
		area= a;
		city=c;
		state=s;
		country=cnt;
		pincode=p;
	}
	public Address(int f,String bn,String a,String c)
	{ 
		flatNo=f;
		bldName=bn;
		area= a;
		city=c;
	}
	public Address(int f,String bn,String a)
	{ 
		flatNo=f;
		bldName=bn;
		area= a;
		
	}
	
	public void Showdetails()
	{
		System.out.println("faltno="+flatNo);
		System.out.println("bldName="+bldName);
		System.out.println("area="+area);
		System.out.println("city="+city);
		System.out.println("state="+state);
		System.out.println("country="+country);
		System.out.println("pincode"+pincode);
	}
	
	public String toString()
	{
		String str = "Faltno "+flatNo+ ",bldName"+bldName+",area"+area+",city"+city+",state"+state+",country"+country+",pincode"+pincode;
	    return str;
	}

}
