import java.io.*;
class EvenOdd
{
 public static void main(String args[])
 {
  int n;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  if(n%2==0)
   System.out.println("Even Number");
  else
   System.out.println("Odd Number");
  }
 }
