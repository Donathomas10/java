/*create a file get data from the kb write it onto the file*/
import java.io.*;
class FCMeth4

{
public static void main(String args[])
{
try
{
FileOutputStream f= new FileOutputStream("test.txt");
DataInputStream dis = new DataInputStream(System.in);
System.out.println("Enter text into the file  .../.. terminate  with $");
while(true)
{
String dt = dis.readLine();
if (dt.equals("$")) break;
else f.write(dt.getBytes());
f.write(dt.getBytes());
}
}catch(IOException e)  {System.out.println(e);}
}
}