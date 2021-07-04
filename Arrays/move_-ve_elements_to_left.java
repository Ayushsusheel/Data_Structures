//we will be using partition approach for this .....


import java.util.*;

public class arrays
{
public static int[] check(int a[],int size)
{
int j=0;
  for(int i=0;i<a.length;i++)
  {
  if(a[i]<0)
  {
  if(i!=j)
  {
  
  int temp=a[i];
    a[i]=a[j];
    a[j]=tmp;
  
  
  }
  j++;
  }
  }

return a;

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
  a=check(a,size);
  System.out.println(Arrays.toString(a));
  
}


}
