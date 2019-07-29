import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n1 = in.nextInt();
      int f=n1/100;
      int l=(n1%100)%10;
      int sum= f+l;
      System.out.println(sum);
	}
}