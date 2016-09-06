import java.io.*;
class Palindrome
{
 public static void main(String args[])throws IOException
 {
  int  v, n, k, rev=0;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  v=n;
  while(n!=0)
  {
   k=n%10;
   rev= rev*10+k;
   n=n/10;
  }
  if(rev==v)
      System.out.println("Is Palindrome");
  else
      System.out.println("Is not Palindrome");
 }
} 

