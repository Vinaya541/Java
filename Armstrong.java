import java.io*;
class Armstrong
{
 public static void main(String args[])throws IOException
 {
  int n,k,v,sum=0;
  DataInputStream ds=new DataInputStream(System.in);
  n=Integer.parseInt(ds.readLine());
  v=n;
  while(n!=0)
  {
   k=n%10;
   sum=sum+k*k*k;
   n=n/10;
  }
  if (v==sum)
       System.out.println("The number is amstrong");
  else
       System.out.println("The number is not a amstrong");
 }
}
