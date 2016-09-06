import java.io.*;
class Reverse
{
 public static void main(String args[])throws IOException
 {
  int  n, k, rev=0;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  while(n!=0)
  {
   k=n%10;
   rev=rev*10+k;
   n=n/10;
  }
  System.out.println(+rev);
 }
}
 
