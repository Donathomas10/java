import java.io.*;
class Dm
{
    public static void main(String args[])
    {
        try
        {
            File f = new File("ddd");
            boolean s = f.mkdirs();
            if(s)
            {
                System.out.println("dir created");
            }
            else
            {
                System.out.println("nooooo");
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}