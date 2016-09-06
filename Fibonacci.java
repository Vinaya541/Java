import java.io.*;
class Fibonacci
{
 public static void main(String args[])
 {
  int a=0, b=1, n, f, i;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  System.out.println(+a+b);
  for(i=0;i<=n-2;i++)
  {
   f=a+b;
   System.out.println(+f);
   a=b;
   b=f;
  }
 }
}
