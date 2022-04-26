//Last in First out
public class StackUsingLL {

	Node  head;

	public StackUsingLL() {
		head = null;
	}
	public void push(int value)
	{
		//create 1  node first
		Node temp = new Node(value);
		if(head == null) {
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
	public void pop()
	{
		Node temp=head;
		if(head==null)  //check for head is null
			System.out.println("LL is Empty:");
		else if(head.getNext()==null)
		{
			temp=head;
			head=null;
		}

		else {   //check for having more than 1 node
			temp =head;     
			head=temp.getNext();
			temp.setNext(null);
		}
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





