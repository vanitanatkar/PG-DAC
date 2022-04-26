//Last in First out
public class StudStackDLL {

	Node  head;
	Node tail;
	public StudStackDLL() {
		head=null;
		tail=null;
	}
	public void push(Student value)//insert node
	{
		Node temp=new Node(value);
		//check for head is null
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		else
		{
			//check for having one or more than one Node in DLL
			temp.setNext(head);
			head.setPrev(temp);
			head=temp;
		}
	}
	public void pop()//delete first node
	{
		if(head==null)
		{
			System.out.println("DLL is empty !");
		}
		else
			if(head==tail)
			{//having 1 node
				Node temp=head;
				head =null;
				tail=null;
			}
			else
			{//more than one node
				Node temp=head;
				head=head.getNext();
				head.setPrev(null);
				temp.setNext(null);

			}
	}
	public void printStack() 
	{
		if(head==null )
			System.out.println("StudStackDLL is empty !");	
		else
		{
			Node it=head;
			while(it!=null)
				{System.out.println(" "+it);
				it=it.getNext();}
		
		}
		
	}

	public void EmptyStack()
	{
		Node it=head;
		//head=tail=null;
		while(it!=null)
		{
			Node itn=it.getNext();
			it.setNext(null); //set every Node next null
			it.setPrev(null); //set every Node prev null
			it=itn;
		}
		head=tail=null;   //imp
	}


	public boolean isEmptyStack() {
		
			if(head==null)
			return true;
		
		else
			return false;
	}

	public String toString() {
		String str=" ";

		Node it=head;
		while(it!=null) {
			str +=" "+it;
			it=it.getNext();}

		return str;
	}
}


