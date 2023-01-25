import java.io.*;
import java.util.*;
class VD
{
 public static void main(String args[])
 {
   Vector <String> vc = new Vector <String> (2,4);
      vc.add("A");
	  vc.add("B");
	  vc.add("C");
	  vc.add("D");
	  vc.add("E");
	  vc.add("F");
	  vc.add("E");
	  vc.add(null);
	  System.out.println(vc.size());
	   System.out.println(vc.capacity());
	   for (String a:vc) {System.out.println(a);}
	   
	  
 }
}

