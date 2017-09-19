package myPack; //package declaration 

public class Main {     //main class definition 

	public static void main(String[] args) {  //main starts here 

        FixedStack fs1=new FixedStack(5);         //creating fixed stack object  
        
        for(int i=0;i<5;i++)
        fs1.push(i);                                 //pushing items
        System.out.println("In the fixed stack ");
        for(int i=0;i<5;i++)
        System.out.println(fs1.pop());                 //displaying items
        
        VariableStack vs1= new VariableStack(8);         //creating variable stack object 
        for(int i=0;i<12;i++)
        	vs1.push(i);                                 //pushing item 
        System.out.println(" ");
        System.out.println("In the Variable stack");
        for(int i=0;i<12;i++)
        System.out.println(vs1.pop());                     //displaying items
        
        
        
	}

}//class ends
