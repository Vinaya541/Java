import java.io.*;
class LeapYear
{
 public static void main(String args[])throws IOException
 {
  int y;
  DataInputStream ds=new DataInputStream(System.in);
  y=Integer.parseInt(ds.readLine());
  if((y%400==0) || (y%4==0) && (y%100!=0))
      System.out.println(y + "is a leap year");
  else
      System.out.println(y + "is not a leap year");
 }
}
