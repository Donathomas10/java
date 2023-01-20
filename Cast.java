import java.io.*;
import java.lang.*;
class parent
{
void test()
 {
 System.out.println("parent");
 }
}
class child extends parent
{
 void test()
 {
 System.out.println("child");
 }
}
class Cast
{
public static void main(String args[])
   {
    parent p1 = new parent();
	p1.test();
	child c1 = new child();
	c1.test();
	parent p2 = new child();
	p2.test();
   }
}