import java.util.Scanner;
class Main{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      StringBuilder sb=new StringBuilder(s1);
      int len=sb.length();
      boolean match=true;
      int front=0;
      int end=len-1;
      while(front!=end)
      {
        if(sb.charAt(front)!=sb.charAt(end))
        {
          match=false;
          break;
        }
        front++;
        end--;
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
