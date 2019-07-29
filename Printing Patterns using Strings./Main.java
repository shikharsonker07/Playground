import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner (System.in);
    String str=sc.next();
    int len=str.length();
    int mid=len/2;
    int space=1,count=0;
    for(int i=mid;i<len;i++)
    {
      for(int j=space;j<len;j++)
      {
        System.out.print(" ");
      }
      space++;
      for(int k=mid;k<=i;k++)
      {
        System.out.print(str.charAt(k));
      }
      System.out.println();
    }
    for(int i=mid;i<len-1;i++)
    {
      for(int j=space;j<len;j++)
      {
        System.out.print(" ");
      }
      space++;
      for(int k=mid;k<len;k++)
      {
        System.out.print(str.charAt(k));
      }
      for(int l=0;l<=count;l++)
      {
        System.out.print(str.charAt(l));
      }
      count++;
      System.out.println();
    }
  }
}