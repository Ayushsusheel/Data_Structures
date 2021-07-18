//by this logic we can remove duplicate elements from {0  to n } in sorted array
import java.util.*;

public class ARRAYS
{
  public static int sol(int a[])
  {
    int val=0;
    for(int i=0;i<a.length-1;i++)
    {
    if(a[i]!=a[i+1])
    {
    a[val]=a[i];
      val++;
    
    }
    }
    
    a[val]=a[a.length-1];
    val++;
    return val;
    
  }
  
  
  
  
  public static void main(String argsss[])
  {
    int a[]={0,0,0,1,1,1,1,2,2,2,3,3,3,3,4,5,6,6,6,7,8,9,10};
    int ans=sol(a);
    for(int i=0;i<ans;i++)
    {
      System.out.print(a[i]+"  ");
    }
    
    
    
  }}
