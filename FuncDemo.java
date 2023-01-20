class test
{
public int fact(int x)
{
if(x>=1) return(x*fact(x-1));
return 1;
}
}

class FuncDemo
{
public static void main(String args[])
{
test t = new test();
int n =4;
int f = t.fact(n);
System.out.println("factorial is :" + f);
}
}
