import java.io.*;
class OddInterval
{
 public static void main (String[] args)throws IOException
 {
	int  a, b;
  DataInputStream ds=new DataInputStream(System.in);
  a=Integer.parseInt(ds.readLine());
  b=Integer.parseInt(ds.readLine());
  while(a<=b)
  {
   if(a%2!=0)
      System.out.println(+a);
   a++;
  }
 }
}
  
  
