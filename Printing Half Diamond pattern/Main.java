import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    int num=0;
    for( int i=1;i<=n;i++)
    {
      for( int j=n-1;j>=i;j--)
      {
      System.out.print(" ");
    }
      for(int k=1;k<2*i;k++)
      {
        System.out.print("*");
      }
      System.out.println();
      
	}
}
}
