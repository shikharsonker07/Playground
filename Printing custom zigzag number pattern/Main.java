import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=2;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i%2==1)
          {
            if(j==n)
            {
              System.out.print(count);
            }
            else
            {
              System.out.print(i);
            }
          }
          else if(i%2==0)
          {
            if(j==1)
            {
              System.out.print(count);
            }
            else
            {
              System.out.print(i);
            }
          }
        }
        count++;
        System.out.println();
      }
	}
}