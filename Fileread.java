/*read from the file*/
/* have a file with content read from that file*/
/*file input straem*/

import java.io.*;
class Fileread
{
 public static void main(String args[])
 {
   try
   {
	char c;int i;
	FileInputStream fin=new FileInputStream("test.txt");
	i=fin.read();
	while(i!=-1)
	{
		c=(char)i;
		System.out.println(c);
		i=fin.read();
	}
	}catch (IOException e) {System.out.println(e);}
   }
 }
