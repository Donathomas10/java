import java.io.*;
import java.lang.*;
class Animal
{
public Animal(){System.out.println("Animal cons");}
public void eat(){System.out.println("Animal Eats");}
}
class cat extends Animal
{
public cat(){System.out.println("Cat cons");}
public void eat(){System.out.println("Cat Eats");}
}
class SinInh
{
public static void main(String args[])
{
cat c1=new cat();
c1.eat();
}
}