////First in First out
public class EmpQueueDLL {

	Node  front;
	Node rear;

	public EmpQueueDLL() {
		front = null;
		rear=null;
	}


	public void insert(Employee value)//append
	{
		Node temp=new Node(value);
		if(rear==null)
		{
			rear=temp;
			front=temp;
		}
		else
		{ rear.setNext(temp);
		temp.setPrev(rear);
		rear=temp;

		}
	}
	public void remove() //delete at front
	{
		//check for head is null
		Node temp=front;
		front=front.getNext();

		if(front==null)
			rear=null;

		else
			front.setPrev(null);
	}
	public void printQueue() 
	{
		if(front==null )
			System.out.println("EmpQueue DLL is empty !");	
		else
		{
			Node it=front;
			while(it==null)
				it=it.getNext();
			System.out.println(it);
		}
	}
	public void MaleEmp()
	{
		if(front==null )
			System.out.println("EmpQueue DLL is empty !");	
		else
		{
			Node it=front;
			while(it!=null)
			{
				if(it.getData().getGender()=='M' ||  it.getData().getGender()=='m')
					System.out.println(it);
			
				it=it.getNext();
			}
		}
	}
	public void EmptyQueue()
	{
		Node it=front;
		//head=tail=null;
		while(it!=null)
		{
			Node itn=it.getNext();
			it.setNext(null); //set every Node next null
			it.setPrev(null); //set every Node prev null
			it=itn;
		}
		front=rear=null;   //imp
	}
	public boolean isEmptyQueue()
	{
		if(front==null)
			return true;
		else
			return false;
	}

	public String toString()
	{
		String str=" ";
		//extra point remaining
		Node it=front;
		while(it!=null)
		{
			str +=" "+it;
			it=it.getNext();
		}
		return str;
	}
}

