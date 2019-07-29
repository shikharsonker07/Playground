import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc =new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int gcd1=GCD(a,b);
      int gcd2=GCD(gcd1,c);
      System.out.println(gcd2);
	}
    public static int GCD(int a,int b)
    {
      int min,gcd=1;
      if(a>b)
      {
        min=a;
      }
      else
      {
        min=b;
      }
      for(int i=1;i<=min;i++)
      {
        if(a%i==0 && b%i==0)
        {
          gcd=i;
        }
      }
      return gcd;
    }
}