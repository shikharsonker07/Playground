import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int sum=0;
      System.out.println(Sum_of_Numbers(n));
	}
    public static int Sum_of_Numbers(int n)
    {
      int sum=0;
      for(int i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      return sum;
    }
}