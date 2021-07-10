

//single element if found more than 1............
public  class ARRAYS
{
	
	public static int solution(int a[],int size)
	{
	if(size==0)
	{
		return size;
	}
	int i=a[0];int j=a[0];
	while(true)
	{
		i=a[i];
		j=a[a[j]];
		if(i==j)
		{
			break;
		}
	}
	
	
	i=a[0];
	while(true)
	{
		if(i==j)
		{
			return i;
		}
		i=a[i];
		j=a[j];
	}
		
		
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


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------any element any no of times found....

public  class ARRAYS
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) //input
		{                                
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			a[a[i]%size]=a[a[i]%size]+size;   //values changed...
		}
		
		for(int i=0;i<size;i++)
		{
			if(a[i]>=size*2)
			{
				System.out.println(i+ " ");//print the index where it has been founded more than 1 times...
			}
		}
			
    for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]%size;                   //since original array has been changed !!!!!!!
                                         //we have to modify our array back to its original format...
		}
    
    
// 		for(int i=0;i<a.length;i++)
// 		{
// 			System.out.print(a[i]+" ");        ------------------->for checking purpose i wrote this loop 
// 		}
		
		
		
		
	}
}			






































