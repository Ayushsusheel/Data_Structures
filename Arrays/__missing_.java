import java.util.*;
public class ARRAYS
{
  public static void main(String argss[])
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size-1];
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    int sum=0;
     for(int i=0;i<a.length;i++)
    {
    sum+=a[i];
    }
    
    int max_sum=(size)*(size+1)/2;
    int missing =max_sum-sum;
    System.out.println(missing);
  }}
