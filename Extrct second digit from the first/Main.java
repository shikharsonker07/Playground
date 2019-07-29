import java.util.Scanner;
import java.lang.*;
class Main 
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int sum=0,f=0,n1,second=0,n2;
      n1=n;
      n2=n;
      while(n>0)
      {
        int digit=(n%10);
        f++;
        n=n/10;
      }
      int count=0;
      while(n1>0)
      {
        second=n1%10;
        count++;
        n1=n1/10;
        if(count==(f-1))
        {
          break;
        }
        
      }
      System.out.println(second);
	}
}