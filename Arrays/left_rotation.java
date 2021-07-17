
import java.util.*;


public class Main
{
    public static void reverse(int a[],int first,int last)
    {
        int i=first;
        int j=last;
        while(i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
    
    public static void rotate(int a[],int data)
    {
        data=data%a.length;
        if(data<0)
        {
            data=data+a.length;
                
        }
        
        
        reverse(a,0,data-1);
        reverse(a,data,a.length-1);
        reverse(a,0,a.length-1);
        
    }
    
    
    
    
    
    
    
    
    public static void main(String arg[])
    {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter size of array--->");
     int size=sc.nextInt();
        System.out.println("enter data value for rotation--->"); 
     int data=sc.nextInt();
        
     int a[]=new int[size];
     
         System.out.println("enter elements for array--->");
        for(int i=0;i<size;i++)
     {
         a[i]=sc.nextInt();
     }
     
     rotate(a,data);
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+" ");
     }
     
     
    }
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------Any no of inputs........not only 1 i/p...............

// public class ARRAYS
// {
// public static void reverse(int a[],int starting,int last)

// {
 
// int i=starting;
// int j=last;
// while(i<=j)
// {
//     int temp=a[i];
//     a[i]=a[j];
//     a[j]=temp;
//     i++;j--;
// }


    
// }
// public static void rotate(int a[],int k)
// {
//     k=k%a.length;
//     if(k<=0)
//     {
//         k=k+a.length;
//     }
//     reverse(a,0,k-1);
//     reverse(a,k,a.length-1);
//     reverse(a,0,a.length-1);
    
    
    
// }







// 	public static void main(String arhh[])
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("enter test case");
// 		int testcase=sc.nextInt();
		
// 		for(int i=0;i<testcase;i++)
// 		{
			
// 			System.out.println("enter size");
// 			int size=sc.nextInt();
// 			System.out.println("enter rotation");
// 			int ro=sc.nextInt();
// 			int a[]=new int [size];
// System.out.println("enter ele");
// for(int x=0;x<a.length;x++)
// {
// 	a[x]=sc.nextInt();
// }
// rotate(a,ro);		
// for(int val:a )
// {
// 	System.out.print(val+" ");
// }

// }

		
		
		
// }}




