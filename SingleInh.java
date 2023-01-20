import java.io.*;
import java.lang.*;
class Test
{
 public Test()    {System.out.println("Test cons - no args");}
 public Test(int a)  {System.out.println("Test cons - 1 args");}
  {
   System.out.println("MY IIB");
  }
}
class SingleInh
{
 public static void main(String args[])
 {
  Test t1=new Test();
  Test t2=new Test(10);
 }
}
