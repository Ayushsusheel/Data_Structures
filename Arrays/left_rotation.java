
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
     
     
     int size=sc.nextInt();
     int data=sc.nextInt();
     int a[]=new int[size];
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
