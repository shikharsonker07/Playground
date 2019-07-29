import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
    int f=n1/100;
    int m = (n1%100)/10;
    int l= n1%10;
    int rev= (l*100)+(m*10)+f;
         System.out.println(rev);
  }
}