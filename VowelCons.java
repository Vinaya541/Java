import java.io.*;
class VowelCons
{
 public static void main(String args[])
 {
  char a;
  DataInputStream ds = new DataInputStream(System.in);
  a=(char) ds.read();
  if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I'|| a=='o' || a=='O' || a=='u' || a=='U')
      System.out.println("Vowel");
  else
      System.out.println("Consonant");
 }
}
