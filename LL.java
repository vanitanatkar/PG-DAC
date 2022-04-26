
public class LL {

	Node  head;

	public LL() {
		head = null;
	}
	public void insert(int value)
	{
		//create 1  node first
		Node temp = new Node(value);

		// check for  heat is pointing to null if yes then give 1st node reference to head
		if(head==null)
		{
			head=temp;
		}
		else
		{//check for having  at least 1 node
			if(head.getNext()==null)
			{
				temp.setNext(head);
				head=temp;
			}
			else
				//check for having more than 1 node
				temp.setNext(head);
			head=temp;
		}
	}
	public void append(int value) // C2 * (n-1)  ==>  n-1 ==> O(n)
	{
		Node temp=new Node (value);

		if(head==null) //check for first node //C1
		{
			head =temp;
		}
		else
		{
			Node it=head;
			while(it.getNext()!=null) //C2 (n-1)
			{
				it=it.getNext();
			}
			it.setNext(temp);    //it is not pointing last node
		}
	}	
private int getNumOfNode()
{
	int count=0;
	Node it=head;
	while(it!=null) 
	{
		count++;
		it=it.getNext();
	}//it =null loop end
	return count;
}
public  void InsertByPos(int value, int pos)
{
	int NON = getNumOfNode();
	if(pos==1)
	{
		insert(value);
	}
	else if(pos==(NON+ 1))
	{
		append(value);
	}
	else if(pos>1  &&  pos<=NON) //check pos is greater than one and greater than equal to NON
	{
		Node temp =new Node(value);
		// we have to insert node in middle
		Node it =head;
		for(int i=1;i<(pos-1);i++)
		{
			it=it.getNext();
		}
		//'it' reach the targeted node..
		temp.setNext(it.getNext());   
		it.setNext(temp);
	}
	else
		System.out.println("Enter  valid pos value:");	
}
public String toString() {
	String str="";

	Node it=head;
	while(it!=null)
	{
		//str += "" + it.getData() + "-->";
		str+=" "+it;
		it=it.getNext();
	}

	return str;

}

}