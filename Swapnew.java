import java.io.*;
import java.lang.*;
class Myclass
{
int x;
}
class Test
{
public static void swapfn(Myclass a,Myclass b)
{
System.out.println("function before swapping a::"+a.x+"b ::"+b.x);
int c=a.x;
a.x=b.x;
b.x=c;
System.out.println("function After swapping a::"+a.x+" b::"+b.x);
}
}
class Swapnew
{
public static void main(String args[])
{
Test t=new Test();
Myclass m1=new Myclass();
m1.x=10;
Myclass m2=new Myclass();
m2.x=299;
System.out.println("before swapping A::"+m1.x+" B::"+m2.x);
t.swapfn(m1,m2);
System.out.println("before swapping A::"+m1.x+" B::"+m2.x);
}
}