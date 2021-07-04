//NOW MOVE ELEMENTS TO RIGHT SIDE 
public class ARRAYS
{
	public static int[] check(int a[],int size)
	{
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			if(a[i]<=0 && a[j]>=0)
			{
				int temp=a[j];
				a[j]=a[i];
					a[i]=temp;
					i++;j--;
			}
			else if(a[i]>=0 && a[j]>=0)
			{
				i++;
			}
			else if(a[i]<=0 && a[j]<=0)
			{
				j--;
			}
			else if(a[i]>=0 && a[j]<=0)
			{
				i++;j--;
			}
			else
			{
				i++;j--;
			}
		}
		return a;
	}
	
	
	
	
	public static void main(String aaaa[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
				
		a=check(a,size);
		System.out.println(Arrays.toString(a));
				
	}
}
