import java.io.*;
class My100
{
static void checksum(int n)
  {
  if (n !=100)
  {
  throw new ArithmeticException("you should not enetr 100");}
  
  else{System.out.println("Number entered is fine");}
  }
  public static void main(String args[])
  {
  try
  {
  checksum(100);
  }
  catch(ArithmeticException e){System.out.println(e);}
  }
}





