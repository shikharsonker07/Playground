import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println(Max_Index(arr,n));
  }
  public static int Max_Index(int arr[],int n)
  {
    int large=0,large_index=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>large)
      {
        large=arr[i];
        large_index=i;
      }
    }
    return large_index;
  }
}
