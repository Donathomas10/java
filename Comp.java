import java.io.*;
import java.lang.*;
class Complex
	int rl;
	int im;
	String str;
void read()
	{
		DataInputStream din;
		din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter real part:");
			str=din.readLine();
			rl=Integer.parseInt(str);
			System.out.println("Enter imaginary part");
			str=din.readLine();
			im=Integer.parseInt(str);
		}
		catch (Exception e) {System.out.println("Error"+e);}
	}
void disp()
{
	System.out.println("The real part is :"+rl);
	System.out.println("The imag part is :"+im);
	System.out.println("The number is :"+rl+" + "+im+"i");
}
}
class Comp
{
public static void main(String args[])
{
Comp C1=new comp();
System.out.println("first");
C1.read();
C1.disp();
}
}