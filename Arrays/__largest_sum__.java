import java.util.*;
import java.io.*;
public  class ARRAYS
{
	
	public static int solution(int a[],int size)
	{
		int max_sum=Integer.MIN_VALUE,curr_sum=0;
		for(int i=0;i<a.length;i++)
		{
			curr_sum=curr_sum+a[i];
			if(curr_sum<a[i])
			{
				curr_sum=a[i];
			}
			 if(max_sum<curr_sum)
			{
				max_sum=curr_sum;
			}
			
		}
		return max_sum;
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int answer=solution(a,size);
		System.out.println(answer);
		
		
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public static int solution(int a[],int size)
	{
		int max_sum=-9999999999,curr_sum=0;
		for(int i=0;i<a.length;i++)
		{
			curr_sum=curr_sum+a[i];
			if(curr_sum>max_sum)
			{
				max_sum=curr_sum;
			}
			 if(curr_sum<0)
			{
				curr=0;
			}
			
		}
		return max_sum;
	}


/*
intialize max sum as -infinity....or simply Integer.MIN_VALUE

if the maximum sum is less than current update max....

if now current sum has became -ve discard that part and make current sum again as ZERO!!!.... 
*/




	
	
	
	
	
	







