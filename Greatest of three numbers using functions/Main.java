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
      int result1=Greatest(a,b);
      int result2=Greatest(result1,c);
      System.out.println(result2);
	}
    public static int Greatest(int a,int b)
    {
      if(a>b)
      {
        return a;
      }
      else
      {
        return b;
      }
    }
}