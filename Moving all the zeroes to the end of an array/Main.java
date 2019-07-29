import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      Zero_Last(a, n);
    }
    public static void Zero_Last(int a[],int n) 
    {
      int non_zero[]= new int[n];
      int zero[]= new int[n];
      int zero_count=0,non_zero_count=0,count=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          zero[zero_count++]=a[i];
        }
        else
        {
          non_zero[non_zero_count++]=a[i];
        }
      }
      for(int i=0;i<non_zero_count;i++)
      {
        a[i]=non_zero[i];
        count++;
      }
      for(int i=0;i<zero_count;i++)
      {
        a[count]=zero[i];
        count++;
      }
      for(int i=0;i<count;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
}