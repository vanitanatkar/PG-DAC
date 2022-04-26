//first in first out
public class QueueUsingLL {

	Node  head;

	public QueueUsingLL() {
		head = null;
	}
	public void insert(int value) //append
	{
		// C2 * (n-1)  ==>  n-1 ==> O(n)
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
	public void remove()//delete first
	{
		Node temp=head;
		if(head==null)  //check for head is null
			System.out.println("LL is Empty:");
		else if(head.getNext()==null)
		{temp=head;
		head=null;}

		else {   //check for having more than 1 node
			temp =head;     
			head=temp.getNext();
			temp.setNext(null);}
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
