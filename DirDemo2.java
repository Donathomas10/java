import java.io.*;
class 	DirDemo2
{
static void main(String p)
 {
   try
   {
	  File f = new File("aaa");
	  File[] fa=f.listFiles();
	  for(File A:fa) 
	  {
	   if (A.isFile())  {System.out.println("File"  +A);}
	   
	   else 
	   {
		   System.out.println("Directory" +A);
		   listall(A.getPath());
	   } 
	  }
	  
	  }catch (Exception e) {System.out.println(e);}
   }
   public static void main(String args[])
   {
	   listall("aaa");
   }
 
}