
public class EmpLinkList {

	Node  head;

	public EmpLinkList() {
		head = null;
	}
	public void insert(e value)
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
	public void append(Employee value) // C2 * (n-1)  ==>  n-1 ==> O(n)
	{
		Node temp=new Node(value);

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
	public  void InsertByPos(Employee value, int pos)
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
		else if(pos>1  &&  pos<=NON)//check for pos is greater than one and less than equal to NON
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
	public void deleteFirst()
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
	public void deleteLast()
	{
		if(head==null) 	//check for head is null
			System.out.println("LL is Empty:");
		//check for having at least one node
		else if(head.getNext()==null) {
			Node temp =head;
			head=null;}
		//check for having more than one node
		else {
			Node it=head;
			while(it.getNext().getNext()!=null)
			{
				it=it.getNext();  //check it =it.getNext
			}
			Node temp=it.getNext();   //it.getNext=null ; now temp=null
			it.setNext(null); 
		}     //last Node=null	
	}

	public void deleteByPos(int pos)
	{

		int NON= getNumOfNode();
		//check for head is null
		if(head==null)
		{
			System.out.println("LL is Empty:");
		}
		//check for having 1 node only
		else if(pos==1)
		{
			deleteFirst();
		}
		//check for having last node
		else if(pos==(NON + 1))
		{
			deleteLast();
		}
		else if(pos>1  &&  pos<=NON)
		{
			// we have to delete node in middle
			Node it =head;

			for(int i=1;i<pos-1;i++)
			{
				it=it.getNext();
			}
			//'it' reach the targeted node..
			it.setNext(it.getNext().getNext());
			Node temp =it.getNext();
			temp=null;

		}

	}
	public void reverse()
	{
		Node itp=null;
		Node it=head;
		Node itn=head;

		while(it!=null)
		{
			itn=itn.getNext();
			it.setNext(itp); //first time itp is null so that last node =null
			itp=it;  //
			it=itn;	//
		}
		head=itp;  //itp=next node reference
	}

	public void getEmployeeByID(int id)
	{  
		Node it = head;
		while(it != null)
		{
			if(it.getData().getEmpid() == id)
				System.out.println(it);
			it=it.getNext();
		}
	}

	public void getEmpBySalWise()
	{
		Node it = head;
		while(it != null)
		{
			if(it.getData().getSalary()> 2000)
				System.out.println(it);
			it=it.getNext();
		}
	}

	public void getEmployeeByName(char c) 
	{
		Node it = head;
		while(it != null)
		{
			if(it.getData().getName().charAt(0) == c)
				System.out.println(it);
			it=it.getNext();
		}
	}
	public void printEmpdeatils() {
		if(head==null) 	//check for head is null
			System.out.println("LL is Empty:");
		else {
			Node it=head;
			while(it==null)
			{
				System.out.println("  ,"+it.getData());
			}
		}
	}
	public void deleteEmptyList()
	{
		Node tmp = head;
		while(head != null)
		{
			tmp=head;
			head = head.getNext();
			tmp=null;
		}
	}

	public String toString() {
		String str="";

		Node it=head;
		while(it!=null)
		{
			//str += "" + it.getData();
			str+=" "+it;
			it=it.getNext();
			System.out.println(" ");
		}

		return str;

	}

}
/*	----------------------------------------------------------------------------------------------------------
 *************** Functions***********************
-------------------------------------------------------------------------------------------------------------

public void getEmployeeByGenderFemale()
	{
		Node it = head;
		while(it != null)
		{
			if(it.getData().getGender() == 'f' || it.getData().getGender() == 'F')
				System.out.println("Female : " + it.getData());
			it=it.getNext();
		}
	}


 **********delete data of nodes************
	public void deleteNodesData() 
	{
		Node it = head;
		while(it != null)
		{
			it.setData(null);
			it=it.getNext();
		}
	}
}

/*-------------------------------------------------------------------------------------------------
 *                                             ****** End*******
 * ----------------------------------------------------------------------------------------------*/




