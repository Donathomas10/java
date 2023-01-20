import java.io.*;
class 	DirDemo
{
 public static void main(String args[])
 {
   try
   {
	  File f = new File("aaa/aa//a");
	  boolean s =f.mkdirs();
	  if(s)
	  {
		System.out.println("directory created");  
		  
	  }
	  else
	  {
		  System.out.println("Noooooooooooo");
	  }
	  
	  
	}catch (Exception e) {System.out.println(e);}
   }
 }
