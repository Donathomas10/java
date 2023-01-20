import java.io.*;
import java.lang.*;
class Num
{
	int nl;
	String str;
void read()
	{
		DataInputStream din;
		din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter number n");
			str=din.readLine();
			nl=Integer.parseInt(str);
		}
		catch (Exception e) {System.out.println("Error"+e);}
	}
void disp()
{
	System.out.println("The number is :" +nl);
}
}
class ReadDisp
{
public static void main(String args[])
{
Num n = new Num();
n.read();
n.disp();
}
}