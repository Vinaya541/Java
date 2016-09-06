import java.io.*;
class SumofnL
{
 public static void main(String args[])throws IOException
 {
  int n, s=0;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  for(int i=1; i<=n; i++)
  {
      s=s+i;
  }
  System.out.println(s);
 }
}
  
