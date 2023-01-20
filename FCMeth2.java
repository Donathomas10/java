import java.io.*;
class FCMeth2
{
public static void main(String args[])
{
try
{
FileOutputStream f1=new FileOutputStream("test123.txt");

 System.out.println("file created");

}catch (IOException e) {System.out.println(e);}
}
}