import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    int max=0;
    for(int i=0;i<size;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      max=0;
      for(int j=i+1;j<size;j++)
      {
        if(a[j]>a[i])
        {
          
          if(a[j]>max)
          {
            max=a[j];
            System.out.println(a[i]+","+a[j]);
          }
        }
      }
    }
  }
}