import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(isPrime(i))
        {
          System.out.println(i);
        }
      }
	}
    public static boolean isPrime(int n)
    {
      int count=0;
      for(int i=2;i<n;i++)
      {
        if(n%i==0)
        {
          count++;
        }
      }
      if(count==0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}