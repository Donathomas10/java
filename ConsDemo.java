import java.io.*;
import java.lang.*;
class Animal
{

{
System.out.println("Cons is called");
}
demo(int a,string b)
{
	x=a;
	y=b;
	System.out.println("a");
	System.out.println("b");
}
}
void inc()
{
	x=x+1;
	System.out.println("x");
}
class ConsDemo
{
public static void main(String args[])
{
demo d1=new demo();
demo d2=new demo(10,"rajagiri");
}
}