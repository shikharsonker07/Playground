import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(Factorial(n));
  }
  public static int Factorial(int n)
  {
    if(n==1)
    {
      return 1;
    }
    return n*Factorial(n-1);
  }
}