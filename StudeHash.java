
public class StudeHash {
	Student [] str;  


	public StudeHash(int size)//hash table size
	{
		str=new Student[size];

	}
	public void insert(Student Stud)
	{
		int  key=hash_function(Stud);
		System.out.println("Got "+key+" intput for Str "+Stud);
		// is this location is empty
		if(str[key]==null)//location is empty
		{
			str[key]=Stud;
		}
		else {//location is not empty
			while(true)
			{
				key++;
				if(key==str.length)
					key=0;

				if(str[key]==null)
					str[key]=Stud;
				break;
			}

		}
		System.out.println(" loction of key at  "+key+ "  index in array ");
	}

	private int hash_function(Student Stud)
	{  
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+Stud.getMobileNo().charAt(i);            //we can also add square of ascii value char(i)...
		}
		// sum=sum+(inputStr.length()*inputStr.length());
		int key=sum%str.length;
		return key;
	}
}
	/*public void search (String inputStr)
	{
		int key =hash_function(inputStr);
		int temp_key=key;
		if(str[key].equals(inputStr))
		{//we got our data at same index key:
			System.out.println("key of "+inputStr+"is "+temp_key+" and it is found at index"+key);
		}
		else;
		{
			while(true)
			{
				key++;
				if(key==str.length)
					key=0;
				if(str[key].equals(inputStr))
				break;
			}
		}
		System.out.println("key of "+inputStr+"is "+temp_key+" and it is found at index"+key);
	}

}
*/