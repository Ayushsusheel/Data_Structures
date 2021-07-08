
//----------------------------rotate by one clockwise---------------

import java.util.*;

public class Arrays
{
  public static int[] solution(int a[],int size)
  {
  int temp=a[size-1];
    for(int i=a.length-1;i>0;i--)
    {
    a[i]=a[i-1];
    }
    a[0]=temp;
  
  return a;
  
  }
  
  
  public static void main(String arggg[])
  {
   Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
  
    solution(a,size);
    System.out.println(Arrays.toString(a));
  }
  
}//--------------------------------------------------now  for anticlockwise .......
import java.util.*;

public class Arrays
{
  public static int[] solution(int a[],int size)
  {
  int temp=a[0];
    for(int i=0;i<=a.length-2;i++)
    {
    a[i]=a[i+1];
    }
    a[size-1]=temp;
  
  return a;
  
  }
  
  
  public static void main(String arggg[])
  {
   Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
  
    solution(a,size);
    System.out.println(Arrays.toString(a));
  }

  
  
  
  
  
  
  
    
  
