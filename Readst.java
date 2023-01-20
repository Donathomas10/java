import java.io.*;
public class Readst
{
public static void main(String args[])
{
String str;
char c;
{
System.out.println("Enetr a string:");
DataInputStream dis = new DataInputStream(System.in);
Str= dis.readLine();
System.out.println("Entered  value is " +str);
System.out.println("Enetr a character");
c = (char)dis.read();
System.out.println("Entered char is" +c);
}
}
}





















