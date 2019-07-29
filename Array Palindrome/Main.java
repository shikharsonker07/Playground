import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      int front=0;
      int end=size-1;
      boolean match=true;
      while(front<end)
      {
        if(a[front]!=a[end])
        {
          match=false;
          break;
        }
        end--;
        front++;
      }
      if(match==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
    }
}