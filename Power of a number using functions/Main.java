import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      System.out.println(Power(b,e));
	}
    public static int Power(int b,int e)
    {
      int result=1;
      for(int i=1;i<=e;i++)
      {
        result=result*b;
      }
      return result;
    }
}