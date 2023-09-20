package tech.question;
import java.util.*;

public class StringOccurences 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		char ch[] = new char[str.length()+1];
		for(int i=0;i<ch.length-1;i++)
		{
			ch[i]=str.charAt(i);
		}
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=(i+1);j<ch.length-1;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		System.out.println("Enter the Character :");
		char c=sc.next().charAt(0);
		
		int count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==32)
			{
				continue;
			}
			else if(ch[i]==ch[i+1])
			{
				++count;
			}
			else
			{
				if(ch[i]==c)
				{
				System.out.println(count);
				}
				count=1;
			}
		}
	}
}


