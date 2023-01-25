import java.io.*;
import java.util.*;

class LLD
{
public static void main(String args[])
{
     
	  LinkedList <String> ll = new LinkedList <String> ();
	  ll.add("A");
	  ll.add("D");
	  ll.add("D");
	  ll.add("B");
	  ll.add(null);
	  for (String a:ll) {System.out.println(a);} 
	  System.out.println(ll.size());
	  ll.addFirst("first");
	  ll.addLast("Last");
	  System.out.println("new ll is");
	  for (String a:ll) {System.out.println(a);}
	  Object el=ll.get(1);
	  System.out.println("first element el is" +el);
}
}