package tech.question;
public class String_Swap 
{
    public static void main(String[] args) 
	{
		    String a = "Hello";
	        String b = "World";
            System.out.println("Before swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        a = a + b; 
	        b = a.substring(0, a.length() - b.length()); 
	        a = a.substring(b.length()); 
	        
	        System.out.println("\nAfter swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	  }
}


