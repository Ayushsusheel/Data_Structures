//we have to sort array without using sorting algorithm.....when i/p is of only 0,1,2

import java.util.*;
public class arrays
{
public static void sort(int a[],int size)
{
int i=0,j=0;
  int k=a.length-1;
  while(j<=k)
  {
  switch(a[j])
  {
    case 0 : a[i]=a[i] + a[j] - (a[j]=a[i]);
      i++;j++;break;
    case 1:j++;
      break;
    case 2:a[j]=a[j] + a[k] -  ( a[k] =a[j]);
      k--;break;
  
  }
  
  }
}
  
  
  
  
  
public static void main(String...aaaaaa)
{
Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<a.length;i++)
  {
  a[i]=sc.nextInt();
  }

  sort(a,size);
  System.out.println(Arrays.toString(a));
}} 





