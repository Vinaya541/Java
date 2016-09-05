import java.io.*;
class Alpha
{
 public static void main(String args[])throws IOException
 {
  char n;
  DataInputStream ds=new DataInputStream(System.in);
  n=(char)ds.read(); 
  if(Character.isLetter(n))
      System.out.println("is an alphabet");
  else
      System.out.println("is not an alphabet");
 }
}
