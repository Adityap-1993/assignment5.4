package myPack;              //package declaration 

public class VariableStack implements Stack {            //class definition implementing stack interface

	private int stck[];                                   //creating array 
	
	private int n;                                             //variable for index 
	
	public VariableStack(int size)                       //parameterized constructor 
	{
		stck=new int[size];
		n=-1;
	}
	
	public void push(int item)                 //method for pushing item in stack
	{
		
		if(n==stck.length-1)
		{
			int temp[]=new int[stck.length*2];
			for(int i=0;i<stck.length;i++)
			
				temp[i]=stck[i];
			
			stck=temp;
			
			stck[++n]=item;
		}
		
		else 
			stck[++n]=item;
		
	}
	
	public int pop()                //method for popping out from  stack
	{
		if(n<0)
			{
			System.out.println("Stack underflow");
			return 0;
			}
		else 
			return stck[n--];
			}
	}
	


