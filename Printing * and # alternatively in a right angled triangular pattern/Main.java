import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1,hastag=1,star=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=i;j++)
        {
          if(count==1)
          {
            System.out.print("*");
            break;
          }
          if(count>1 && hastag<=2)
          {
            if(j%2==0)
            {
              System.out.print("#");
            }
            else if(j%2==1)
            {
              System.out.print("*");
            }
          }
          if(count>1 && star<=2 && hastag==3)
          {
            if(j%2==0)
            {
              System.out.print("*");
            }
            else if(j%2==1)
            {
              System.out.print("#");
            }
          }
        }
        if(count>1 && star<=2 && hastag==3)
        {
          star++;
        }
        if(count>1 && hastag<=2)
        {
          hastag++;
        }
        if(hastag==3 && star==3)
        {
          hastag=1;
          star=1;
        }
        count++;
        System.out.println();
      }
	}
}