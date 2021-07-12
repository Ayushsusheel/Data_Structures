import java.util.*;
public  class ARRAYS
{
	public static void solution(int size1,int size2,int a1[],int a2[])
	{
	
		int i=size1-1;
		int j=0;
		while(i>=0 && j<size2)
		{
			if(a1[i]>a2[j])
			{
				int temp=a1[i];
				a1[i]=a2[j];
				a2[j]=temp;
				i--;j++;
			}
			else
			{
				break;
			}
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
	}

	 
	 
	 public static void main(String...axyzbcde)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size for 1st array");
		int size1=sc.nextInt();
		System.out.println("enter size for 2nd array");
		int size2=sc.nextInt();
		int a1[]=new int[size1];
		int a2[]=new int[size2];
		System.out.println("enter elements for 1st array");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter elements for 2nd array");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		
	solution(size1,size2,a1,a2);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}}














