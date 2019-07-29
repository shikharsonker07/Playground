import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      StringBuilder sb=new StringBuilder(s1);
      int stat[]=new int[26];
      int offset=0,len=sb.length();
      char ch;
      for(int i=0;i<26;i++)
      {
        stat[i]=0;
      }
      for(int i=0;i<len;i++)
      {
        ch=sb.charAt(i);
        if(ch>='a' && ch<='z')
        {
          offset=ch-'a';
          stat[offset]++;
        }
        else if(ch>='A' && ch<='Z')
        {
          offset=ch-'A';
          stat[offset]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(stat[i]==0)
        {
          System.out.print((char)(i+'a')+" ");
        }
      }
    }
}