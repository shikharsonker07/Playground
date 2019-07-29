import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      System.out.println(Square_of_Number(n));
	}
    public static int Square_of_Number(int n)
    {
      return n*n;
    }
}