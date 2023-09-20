package tech.question;
import java.util.Scanner;
public class StringPalindrome
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		int mid=ch.length/2;
		int end=ch.length-1;
		
		for(int i=0;i<mid;i++)
		{
			char temp=ch[i];
			ch[i]=ch[end];
			ch[end]=temp;
			end--;
		}
		
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			s=s+ch[i];
		}
	
		if(s.equals(str))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}


