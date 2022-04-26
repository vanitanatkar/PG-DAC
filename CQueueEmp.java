

public class CQueueEmp {
		Employee employee [];
		int F;
		int R;

		public CQueueEmp()
		{
			employee= new Employee[5];
			F=R=-1;
		}

		public CQueueEmp(int size)
		{
			employee= new Employee [size];
			F=R=-1;
		}

		public void insert(Employee value)
		{
			if((F==0 && R==employee.length-1)||(R+1==F))
			{
				System.out.println("Queue is Full");
			}
			else
			{//we have some space in C-queue
				if(R==employee.length-1)
					R=0;
				else
					R++;

				//check if this is going to be first element in C-queue
				if(F==-1)
					F++;
				//now insert element in c-queue
				employee[R]= value;
			}	
		}

		public void remove( )
		{
			Employee value;
			if(F==-1)
			{
				System.out.println("Queue is Empty!");
			}
			else
			{
				//we have some element in queue
				value = employee[F];
				//check for last element
				if(F==R)
				{
					F=R=-1;
				}
				else
				{
					//we have more than one element
					if(F== employee.length-1)
						F=0;
					else
						F++;
				}
			}

		}
		public String toString()
		{
			String str = "";

			if(F==-1)
			{
				str="Queue is Empty";
			}
			else
			{
				int i=F;
				while (i!= R)
				{
					str = str + employee[i]+",";
					if(i==employee.length-1)
						i=0;
					else
						i++;
				}
				//to capture last element
				str=str+employee[i]+",";
			}
			return str;	
		}


}