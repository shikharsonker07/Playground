import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner (System.in);
      int n1=sc.nextInt();
      int fact=1,digit,sum=0,n2;
      n2=n1;
      while(n1>0)
      {
        digit=n1%10;
        fact=1;
        for(int i=1;i<=digit;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        n1=n1/10;
      }
      //System.out.println(sum);
      if(sum==n2)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	}
}