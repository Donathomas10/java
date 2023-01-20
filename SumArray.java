import java.io.*;
import java.lang.*;
 public class SumArray
{
public static void main(String args[])
{
int a[],n;
String str;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("enter the size of th array");
n=Integer.parseInt(din.readLine());
a=new int[n];
System.out.println("enter elements into the array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(din.readLine());
}
System.out.println("The array elements are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
catch(Exception e) {System.out.println("Error"+e);}
}
}