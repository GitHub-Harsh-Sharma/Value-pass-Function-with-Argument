import java.io.*;
class Valuefunwitharg
{
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value a:");
        int a=Integer.parseInt(br.readLine());
        System.out.print("Enter the value b:");
        int b=Integer.parseInt(br.readLine());
        value(a,b);

    }
    public void value(int a,int b)
    {
        int e=a;
        a=b;
        b=e;
        print(a,b);
    }
    public void print(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[])throws IOException
    {
        Valuefunwitharg vf=new Valuefunwitharg();
        vf.input();
    }
}