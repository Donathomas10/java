//wait can happen in synchronized blocks


import java.lang.*;
class Sum extends Thread
{
int total=0;
public void run()
{
	
 for (int i = 0;i<=10;i++)
 {total=total+i;}


}
}
class waitdemo
{
public static void main(String args[])

{
 Sum s=new Sum();
 s.start();
 synchronized(s)
 {
	 try
	 {
		 s.wait();
 }catch (InterruptedException e) {System.out.println(e);}
 }
 
  System.out.println("Sum is "+ s.total);
}
}
