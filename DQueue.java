/*Dqueue or Double Ended Queue is a generalized version of Queue data structure that allows insert and delete at both ends.
 insertFront() : Adds an item at the front of Deque.
insertRear()  : Adds an item at the rear of Deque.
deleteFront() : Deletes an item from front of Deque.
deleteRear()  : Deletes an item from rear of Deque.
 */
public class DQueue { 
	Node  front;
	Node rear;
	public DQueue()
	{
		front=null;
		rear=null;
	}

	public void insertAtFront(int value)
	{
		Node temp=new Node(value);
		//check for head is null
		if(front==null)
		{
			front=temp;
			rear=temp;
		}
		else
		{
			//check for having one or more than one Node in DLL
			temp.setNext(front);
			front.setPrev(temp);
			front=temp;
		}
	}
	public void insertAtRear(int value)
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
	public void deleteAtFront()
	{
		//check for head is null
		Node temp=front;
		front=front.getNext();

		if(front==null)
			rear=null;

		else
			front.setPrev(null);
	}

	public void deleteAtRear()
	{
		Node temp=rear;
		rear=rear.getPrev();
		
		if(rear==null)
			front=null;
		else
			rear.setNext(null);
	}

	public String toString()
	{
		String str=" ";
		Node it=front;
		while(it!=null)
		{
			str +=" "+it+"-->";
			it=it.getNext();
		}
		return str;
	}
}