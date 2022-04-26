
public class CircularLL {
	Node head;

	public CircularLL()
	{
		head=null;
	}

	public void insert(int value)
	{
		Node temp=new Node(value);
		if(head==null)	{
			head=temp;
			head.setNext(head);
		}
		else
		{
			//one or more than one Node
			Node it=head;
			while(it.getNext()!=head)
			{
				it=it.getNext();

			}
			it.setNext(temp);
			temp.setNext(head);
			head=temp;		

		}
	}
	public void append(int value)
	{Node temp=new Node(value);
	if(head==null)	
	{
		head=temp;
		head.setNext(head);
	}
	else
	{//one or more than one Node
		Node it=head;
		while(it.getNext()!=head)
		{
			it=it.getNext();
		}
		it.setNext(temp);
		temp.setNext(head);
	}
	}

	public void insertByPos(int value,int pos)
	{
		int count= getNodeCount();
		Node temp=new Node(value);
		if(pos==1)
			insert(value);
		else if(pos==count+1)
			append(value);
		else if(pos>1 && pos<count+1)
		{
			Node it=head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.getNext();	
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
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
		while(it.getNext() != head) {
			it=it.getNext();
			count ++;
		}
		return count;
	}
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("CLL is Empty:");
		}
		//if(head.getNext()==head).
		else 
		{// check having one node in LL
			if(head.getNext()==head)
			{	
				head.setNext(null); //avoid memory leak
				head=null;
			}
			else {
				//check for one or more than one node
				int x=head.getData();
				//swap(head.data,head.next.data)
				head.setData(head.getNext().getData());
				head.getNext().setData(x);
				//now delete head.next..
				Node temp=head.getNext();
				head.setNext(temp.getNext());
				temp.setNext(null);
			}
		}

	}
	public void deleteLast()
	{
		
		if(head==null)
		System.out.println("Empty LL");
		
		else if(head.getNext()==head) 
		{	head.setNext(null);
			head=null;
	}
		else {
			Node it=head;
			while(it.getNext().getNext()!=head)
			{
				it=it.getNext();
			}
			it.getNext().setNext(null);
			it.setNext(head);	
		}
	}
	
	public void deletByPos(int pos)
	{
		int count=getNodeCount();
		if(pos==1)
			deleteFirst();
		
		else if (pos==count)
		{	deleteLast();}
		else if(pos>1 && pos<count+1)
			{Node it=head;
		while(it.getNext().getNext()!=head)
		{
			it=it.getNext();
		}
		Node temp=it.getNext();
		it.setNext(temp.getNext());
		temp.setNext(null);
		}
		else 
		System.out.println("Enter Valid Position !!!");
	}
	public void reverse()
	{
		Node itp=head;
		Node it=head.getNext();
		Node itn=head.getNext();
		while(it!=head)
		{
			itn=itn.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
			}
		head.setNext(itp);
		head=	itp;
		}
	public  String toString()
	{
		String str=" ";
		Node it=head;
		do//if we use only while here then  it will directly comes out of loop bcoz start is head and end also head..thats why we need do/while loop.....
		{
			str +=" "+it+" -->";
			it=it.getNext();

		}while(it!=head);
		return str;
	}
}
