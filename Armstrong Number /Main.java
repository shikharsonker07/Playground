import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner (System.in);
      int n1=sc.nextInt();
      int f=0,digit,n2;
      double sum=0;
      n2=n1;
      int n3;
      n3=n1;
      while(n1>0)
      {
        digit=n1%10;
        f++;
        n1=n1/10;
      }
      while(n2>0)
      {
        digit=n2%10;
        sum=sum+(Math.pow(digit,f));
        n2=n2/10;
      }
      if(sum==n3)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
      
	}
}