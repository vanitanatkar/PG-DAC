//first in first out
public class StudQueueLL {
	Node front;
	Node rear;

	public StudQueueLL( )
	{
		front=null;
		rear=null;

	}
	public void insert(Student value) {
		Node temp=new Node(value);
		if(front==null)//check for first node
		{
			rear=front=temp;
		}
		else {
			Node it =rear;
			while(it.getNext()!=null)
			{
				it=it.getNext();
			}
			it.setNext(temp); //it is not pointing last Node   
		}

	}
	public void remove()//delete at start
	{
		//check for front and rear null
		if(front ==null)
		{
			System.out.println(" Queue is Empty:");
			
		}
		else
		{// having only one element in Queue
			if(front.getNext()==null)
			{
				
				Node temp=front;
				front=null;
				//front and rear should be null after deleting first node
			}
			else
			{//having more than one element
				Node temp= front;
				front = front.getNext();
				temp.setNext(null);
			}
		}
	}
	public void printQueue()
	{
		toString();
	}
	public void maleStudent() {
		if(front==null)
		{
			System.out.println("Queue is Empty:");
		}
		else
		{
			
			Node it=front;
			while(it!=null)
			{
				if(it.getData().getGender()== 'M' || it.getData().getGender()=='m')
				{
					System.out.println(" "+it);
					
				     it=it.getNext();
					
				}
				
			}
		}
	}
	public void femaleStudent()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty:");
		}
		else
		{
			Node it=front;
			while(it!=null)
			{
				if(it.getData().getGender()== 'F'|| it.getData().getGender()=='f')
				{
					System.out.println(" "+it);
					it=it.getNext();
				}
			}
		
		}
	}
	public void EmptyQueue()
	{
		Node it=front;
		//front =rear=null;
		while(it!=null) {
			Node itn=it.getNext();
			it.setNext(null);//set every node null
			it=itn;
		}
		front=rear=null; 
	}

	public String toString() {
		String str="";
		Node it=front;
		while(it!=null)
		{
			str+=" "+it;
			it=it.getNext();
		}
		return str;
	}


}
