import java.io.*;
class Factorial
{
 public static void main(String args[])throws IOException
 {
  int n,i;
  long fact=1;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  for(i=1;i<=n;i++)
  {
   fact *=i;
  }
  System.out.println(+fact);
 }
}
