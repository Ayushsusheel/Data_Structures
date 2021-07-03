
import java.util.*;
public class arrays
{
  public static void main(String...aaaa)
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    
    int min=a[0];
    int max=a[0];
    for(int i=0;i<a.length;i++)
    {
    if(a[i]>max)
            max=a[i];
    
      else if(min>a[i])
      
             min=a[i];
    }
    
    for(int i=0;i<a.length;i++)
    {
    System.out.print(a[i]+ " " );
    }
    
    
    
    
    
    
    
  }}
