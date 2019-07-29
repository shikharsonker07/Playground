import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in =new Scanner(System.in);
	int n = in.nextInt();
    int num=n;
    for( int i=1;i<=n;i++)
    {
      for( int k=num;k>=1;k--)
      {
        System.out.print(k);
      }
      num=num-1;
      System.out.println();
      
	}
}
}
