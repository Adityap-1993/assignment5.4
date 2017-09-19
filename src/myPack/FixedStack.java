package myPack; //package declaration


public class FixedStack implements Stack{         //class definition implementing stack interface
	
	private int stck[];                           //array declaration 
	
	private int n;                                //instance variable for index 
	
	
	public FixedStack(int size)                   //parameterized constructor 
	{
		stck=new int[size];                       //creating  array
		n=-1;
		
	}
	
	public void push(int item)               //method for pushing item in to stack 
	{
		if(n==stck.length-1)
			System.out.println("Stack Overflow");
		
		else
			stck[++n]=item;
	}
	
	public int pop()                            //method for popping  out item 
	{  
		if(n<0)
			{System.out.println("Stack Underflow");
		return 0;
			}
		
		else
		return stck[n--];
	}
	
	

}//class ends
