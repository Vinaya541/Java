import java.io.*;
class Pnz
{
 public static void main(String args[])
 {
  int n;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  if(n==0)
      System.out.println("Zero");
  else if(n>0)
      System.out.println("Positive");
  else
      System.out.println("Negative");
  }
 }
