import java.io.*;
class LargeNo
{
 public static void main(String args[])throws IOException
 { 
  int a,b,c;
  DataInputStream ds=new DataInputStream(System.in);
  a=Integer.parseInt(ds.readLine()); 
  b=Integer.parseInt(ds.readLine()); 
  c=Integer.parseInt(ds.readLine()); 
  if(a>b)
   {
    if(a>c)
        System.out.println(a + "is big");
    else
        System.out.println(c + "is big");
    }
    else
        System.out.println(b + "is big");
   }
  }
