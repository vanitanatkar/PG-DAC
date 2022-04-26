import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("****Welcome***");
		Populate_Stud(sc);

		while(true)
		{
			System.out.println("1. no of Female Student: ");
			System.out.println("2. no of Male Student: ");
			System.out.println("3. High RollNo Student: ");
			System.out.println("4. Younger Student: ");
			System.out.println("5. Elder Student: ");
			System.out.println("6. Ratio of Student gender: ");
			System.out.println("7. Exit: ");

			System.out.println("please enter your choice:  ");
			int choice=sc.nextInt();
			if(choice>6){
				break;
			}
			switch(choice) {

			case 1: 


				break;
			case 2:

				break;


			}

		}

	} 


	public static void Populate_Stud(Scanner sc)
	{

		System.out.println("Enter how many Student you want");
		int noOfStudent=sc.nextInt();

		Student arr[] = new Student[noOfStudent];

		for(int i=0;i<arr.length;i++)
		{
			String name;
			int age;
			int rollno;
			char gender;

			System.out.println("Enter name:");
			name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter rollno");
			rollno=sc.nextInt();
			System.out.println("Enter gender");
			gender=sc.next().charAt(0);

			arr [i]=new  Student(name,age,rollno,gender);
		}
	}
	public static int femaleStud(Student[]arr,char ch )
	{    
		int count=0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(  arr[i].gender=='f' ||  arr[i].gender=='F')
			{System.out.println("name: "+arr[i].name);
			count++;
			}
		}
		return count;
	}

	public static  int maleStud(Student[] arr,String name, char ch)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i].gender=='m' || arr[i].gender=='M')
			//(arr[i].getGender==' M'  || arr[i].gender== ' m' )
			{	System.out.println("name:"+name);
			sum++;
			}
		}
		return sum;
	}

	public static void HighRollNo(Student[] arr, int rollno)
	{
		for(int i=0;i<arr.length;i++)
		{ 
			int max=0;
			if(arr[i].rollno>max)
				max=arr[i].rollno;
		}
		System.out.println("Highest roll-no student"+rollno);
	}

	public static void ElderStud(Student[] arr,int age,int name)
	{
		for(int i=0;i<arr.length;i++)
		{ 
			int max=0;
			if(arr[i].age>max)
				max=arr[i].age;

		}
		System.out.println("Elder student"+age);

	}
	public void yougestStud(Student[] arr,int age,int name)
	{
		for(int i=0;i<arr.length;i++)
		{ 
			int min=0;
			if(arr[i].age<min)
				min =arr[i].age;
		}
		System.out.println("YoungestStudent"+age);

	}
	public static void genderRatioStud(int count,int sum,String gender)
	{
		int r=0;
		r=count/sum;
		System.out.println("ratio="+r);
	}
	public static void print_Stud_Details(Student[] arr) {
		for(int i=0;i<arr.length;i++)
		{  
			System.out.println(arr[i]);
		}
	}

}
