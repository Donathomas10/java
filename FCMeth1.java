import java.io.*;
class FCMeth1
{
public static void main(String args[])
{
try
{
File f1=new File("test.txt");
boolean fc = f1.createNewFile();
if(fc) {System.out.println("file created");}
else{System.out.println("file not created");}

}catch (IOException e) {System.out.println(e);}
}
}