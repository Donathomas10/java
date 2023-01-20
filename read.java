import java.io.*;
public class Readnum
{
public static void main(string args[])
{
string str,str1;
int x,y,z;
try
{
System.out.println("Enter x");
DataInputStream ds = new DataInputStream(System.in);
Str = dis.readLine();
x=Integer.parseInt(str);
System.out.println("Enter y");
str1 = dis.readLine();
y=Integer.parseInt(str1);
z=x+y;
System.out.println("sum is"+z);
}
catch(IOException e) { System.out.println(e); }
}

}