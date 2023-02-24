import java.io.*;
class TSD
{
    public static void main(String args[])
    {
        TreeSet <String> ts = new TreeSet <String> ();
        ts.add("A");
        ts.add("D");
        ts.add("D");
        ts.add("B");
        for (String a:ts) {System.out.println(a);}
        System.out.println(ts.size());
        ts.clear();
        System.out.println("cleared list");
        for(String a:ts) {System.out.println(a);}
    }
}
