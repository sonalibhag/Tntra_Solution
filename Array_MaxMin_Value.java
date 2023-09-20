package tech.question;

public class Array_MaxMin_Value 
{
    public static void main(String[] args)
	{
        int a[]= {1,2,3,4,5};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
	}
}


