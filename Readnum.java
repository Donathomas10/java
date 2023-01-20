import java.io.*;
public class Readnum
{
public static void main(String args[])
{
String str;
char str1;
int x,y,z;
try
{
System.out.println("Enter Employee no:");
DataInputStream dis = new DataInputStream(System.in);
str = dis.readLine();
x=Integer.parseInt(str);
System.out.println("Enter Employee name");
str1 = dis.readLine();
y=Integer.parseInt(str1);

}
catch(IOException e) { System.out.println(e); }
}

}