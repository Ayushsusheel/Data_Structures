//reverse an array is an easy task ..............
//using while loop or simply for loop we can solve this

import java.util.*;
//import java.io.*;


//-----------------------------------------using for loop simply write your array from last to front ....hehe....
public class main
{
public static void main(String arg[])
{

Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  
  int a[]=new int[size];
   
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  
 for(int n=a.length-1;n>=0;n--)
 {
   System.out.print(a[i]+ "  " );
 }
}}

//-------------------------------------------------using while loop
public class main
{
public static void main(String arg[])
{

Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  
  int a[]=new int[size];
   
  for(int i=0;i<a.length;i++)
  {
    a[i]=sc.nextInt();
  }
  
  int first=a[0];
  int last=a.length-1;
  
  while(first<last)
  {
  int temp=a[first];
    a[first]=a[last];
    a[last]=temp;
  }
 for(int values:a)
 {
   Systm.out.print(values + " " );
 }
}}
