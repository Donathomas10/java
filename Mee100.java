import java.io.*;
class Mee100
{
	public static void main(String args[])
	{
		int i=100;
		try{ 
		if (i==100) throw new DonsException("100 not allowed");}
		catch (DonsException e){System.out.println(e);}
		
	}
}
class DonsException extends Exception
{
	DonsException(String mess)
	{
		super(mess);
	}
}