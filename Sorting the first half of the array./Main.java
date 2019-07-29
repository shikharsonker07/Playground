import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      a[index] = sc.nextInt();  
    }
    insertion_sort(n,a);
  }
  public static void insertion_sort(int n,int a[])
  {
	for(int i=1;i<n/2;i++)
    {
      if(a[i-1]>a[i])
      {
        int temp=a[i-1];
        int j=i;
        while(j>0)
        {
          if(a[j]<a[j-1])
          {
            int b=a[j-1];
            a[j-1]=a[j];
            a[j]=b;
          }
          j--;
        }
        a[i]=temp;
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}