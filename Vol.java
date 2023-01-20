import java.io.*;
import java.lang.*;
class Rectangle
 {
int l,b;
public Rectangle(int x,int y)
 {
l=x;
b=y;
 }
 }
 
class cuboid extends Rectangle
 {
int h;
public cuboid(int x,int y,int z)
 {
super(x,y);
h=z;
 }
int vol()
{
return(l*b*h);
}
 }
class Vol{
public static void main(String args[])
  {
   cuboid c=new cuboid(12,23,34);
   int v=c.vol();
   System.out.println("volume is:" +v);
  }
 }
 
 