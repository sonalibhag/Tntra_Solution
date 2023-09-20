package tech.question;
public class NumberSwap
{
    public static void main(String[] args) 
	{
    	   int a = 10;
           int b = 50;

           System.out.println("Before swapping:");
           System.out.println("a = " + a);
           System.out.println("b = " + b);

           a = a + b;
           b = a - b;
           a = a - b;

           System.out.println("\nAfter swapping:");
           System.out.println("a = " + a);
           System.out.println("b = " + b);
    }
}
