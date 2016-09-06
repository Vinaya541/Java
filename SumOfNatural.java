import java.io.*;
class SumOfNatural
{
 public static void main(String args[])throws IOException
 {
  int n, s=0, i=1;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  while(i<=n)
  {
      s=s+i;
      i++;
  }
  System.out.println(s);
 }
}
