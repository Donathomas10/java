import java.io.*;
import java.lang.*;
class maxclass
{
int max(int a,int b);
{
if(a>b)return a;
else return b;
}
float max(float a,flaot b);
{
	if(a>b)return a;
	else return b;
}
float max(int a,int b);
{
	if(a>b)return a;
	else return b;
}
}
class MethodOverloading
{
public static void main(String args[])
{
maxclass m = new maxclass();
int i1,i2,i3;
DataInputStream din;
din=new DataInputStream(System.in);
try
{
System.out.println("Enetr i1");
i1=Integer.parseInt(din.readLine());
System.out.println("Enter i2");
i2=Integer.parseInt(din.readLine());
i3=m.max(i1,i2);
System.out.println("greater :" +i3);
}
catch (Exception e) {System.out.println("Error"+e);}
}
}
