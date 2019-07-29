import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      Scanner in=new Scanner (System.in);
    int n= in.nextInt();
    int a[ ]=new int[ n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
  }
     int m=in.nextInt();
      pair(n,a,m);
  
    }
  public static void pair(int n,int a[ ], int m)
  {
    int i,j;
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[i]+a[j]==m)
        {
          System.out.print(a[i]+","+" "+a[j]);
        
        System.out.print("\n");
      }
    } 
    }
}
}
