import java.io.*;

class Sumof
{
public void sum(int s)
{
	int a=0;
	int i;
	for(i=0;i<n;i++)
	{
		a=a+(s%10);
		s=s/10;
	}
	System.out.print("sum": +a);
}
class SumNum
{
	public static void main(String args[])
	{
		DataInputStream dis = new DataInputStream(System.in);
		int num;
		System.out.println("enter the size");
		try
		{
			sumof sum=new sumof();
			num=Integer.parseInt(dis.readLine());
			sum=sum(num);
		
		}
		catch (Exception e) {System.out.println("error"+e); }
		
	}
}
