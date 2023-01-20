public class Hello
{
public static void main(String args[])
{
String str;
System.out.println("enter x:");
try
{
DataInputStream dis = new DataInputStream(System.in);
str =dis.readLine();
System.out.println("x is :" + str);
}
catch(IOException e) {Stystem.out.println(e);}
}
}