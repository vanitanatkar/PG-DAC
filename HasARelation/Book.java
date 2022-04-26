package Study.HasARelation;

import Study.Inheritance.InternshipStude;

public class Book {
	private String bookname;
	private float cost;
	private String[] author;


	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public String[] getAuthor() {
		return author;
	}
	public void setAuthor(String[] author) {
		this.author = author;
	}
	public Book()
	{
		bookname="";
		cost=00;
		author= new String[0];
	}
	public Book(String bookname,Float cost,String[] author)
	{
		this.bookname=bookname;
		this.cost=cost;
		this.author= author;
	}

	@Override
	public boolean equals(Object obj) {


		if ( obj instanceof Book)
		{
			boolean authortest =true;
			Book b1 =(Book)obj;
			if(this.author.length==b1.author.length)
			{
				for(int i=0;i<author.length;i++)
				{
					if(this.author[i].equals(b1.author[i])) {continue;}
					else {
						authortest =false;
						break;
					}
				}
			}
			else
				authortest =false;

			if((this.bookname.equals(b1.bookname) && (this.cost==b1.cost) && authortest))
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		String Book="name: "+bookname+", cost:"+cost+", author:"+showAuthor();
		return Book;
	}
	
	public String showAuthor() {
		String str = " ";
		for(int i=0;i<author.length;i++)
		{
			str+=author[i]+",";			
		}
		return str;
	}
	
}
/*We first compare length of the two arrays …
Boolean array decision = true;
If the length is not same ---- decision made that arrays are not equal
If they are equal then we have to check each element
For(i=…arr.length )
If(! ( arr[i].equals(other arr[i] ))
----decision is made that arrays are different 
---no need to continue the loop break !!!
 check the array decision.*/
