
public class DLinkList {
	Node  head;
	Node tail;
	public DLinkList()
	{
		head=null;
		tail=null;
	}

	public void insert(int value)
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
	public void append(int value)
	{
		Node temp=new Node(value);
		if(tail==null)
		{
			tail=temp;
			head=temp;
		}
		else
		{ tail.setNext(temp);
		temp.setPrev(tail);
		tail=temp;

		}
	}
	public void insertBypos(int value,int pos)
	{
		int  count = getNodeCount();
		Node temp=new Node(value);
		if(pos==1)
			insert(value);

		else if(pos==count+1)
		{
			append(value);
		}
		else if(pos>1 && pos<count+1)
		{
			Node it=head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.getNext();	
			}
			it.getNext().setPrev(temp);
			temp.setNext(it.getNext());
			temp.setPrev(it);
			it.setNext(temp);
		} 
		else
		{
			System.out.println("Enter  valid Position:");
		}
	}

	public void deleteFirst()
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
	public void deleteLast()
	{
		if(tail==null)
			System.out.println("DLL is empty !");
		else
			if(head==tail)
			{//having 1 node
				Node temp=head;
				head =null;
				tail=null;
			}
			else
			{//more than one node
				Node temp=tail;
				tail=tail.getPrev();
				tail.setNext(null);
				temp.setPrev(null);
			}

	}

	public void deleteBypos(int pos)
	{
		int  count=getNodeCount();
		if(pos==1)
		{
			deleteFirst();
		}
		else if(pos==count)
		{deleteLast();
		}
		else if(pos>1 && pos<count)
		{
			int x=1;
			Node it=head;
			while(x!=pos)
			{
				it=it.getNext();
				x++;
			}
			it.getPrev().setNext(it.getNext());
			it.getNext().setPrev(it.getPrev());
			it.setNext(null);
			it.setPrev(null);
		}
		else
		{
			System.out.println("Enter  valid Position:");
		}
	}
	private int getNodeCount()
	{
		int count=0;
		Node it=head;
		while(it!=null)
		{
			count++;
			it=it.getNext();
		}
		return count;
	}
	public void reverse()
	{
		Node it=head;
		while(it!=null) 
		{
			Node temp=it.getNext();
			it.setNext(it.getPrev());
			it.setPrev(temp);
			it=it.getPrev();  //Imp 
		}
		//swap(head,tail)
		Node temp=head;
		head=tail;
		tail=temp;

	}
	/*	public void emptyDLL()
	{//
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
	/*
	public void recursion()
	{
		setNextPrevNull(head);
	    head=tail=null;
	}
	private void setNextPrevNull(Node it)
	{
	//forward recursion....
		if(it.getNext()!=null)
		setNextPrevNull(it.getNext());  

		//reverse recursion...
		it.setNext(null);
		it.setPrev(null);
	}
	 */
	public String toString()
	{
		String str=" ";
		//extra point remaining
		Node it=head;
		while(it!=null)
		{
			str +=" "+it+"-->";
			it=it.getNext();
		}
		return str;
	}
}