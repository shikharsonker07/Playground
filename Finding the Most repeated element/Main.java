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
      int count=0,seq_idx=0,same_count=0;
      boolean match=true;
      for(int i=0;i<size;i++)
      {
        count=0;
        match=true;
        for(int j=0;j<size;j++)
        {
          if(a[i]==a[j])
          {
            count++;
          }
        }
        for(int k=0;k<seq.length;k++)
        {
          if(a[i]==seq[k])
          {
            match=false;
          }
        }
        if(match==true)
        {
          seq[seq_idx++]=a[i];
          seq[seq_idx++]=count;
        }
      }
      for(int i=1;i<seq_idx;i=i+2)
      {
        if(seq[i]==1)
        {
          same_count++;
        }
      }
      if(same_count==size-1)
      {
        System.out.println(seq[0]);
      }
      else
      {
        int max=0,max_idx=0;
        for(int i=1;i<seq_idx;i=i+2)
        {
          if(seq[i]>max)
          {
            max=seq[i];
            max_idx=i;
          }
        }
        System.out.println(seq[max_idx-1]);
      }
    }
}