import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      int seq[]=new int[size*2];
      int seq_idx=0,start_idx=0;
      for(int i=0;i<size-1;i++)
      {
        if(a[i]==1 && a[i+1]==0)
        {
          seq[seq_idx++]=start_idx;
          seq[seq_idx++]=i;
          
        }
        else if(a[i]==0)
        {
          start_idx=i+1;
        }
      }
      if(start_idx==size-1)
      {
        seq[seq_idx++]=start_idx;
        seq[seq_idx++]=size-1;
      }
      int prev=0;
      for(int i=0;i<seq_idx-1;i=i+2)
      {
        start_idx=seq[i];
        int end=seq[i+1];
        int count=0;
        for(int j=start_idx;j<=end;j++)
        {
          count++;
        }
        if(count>prev)
        {
          prev=count;
        }
      }
      System.out.println(prev);
    }
}