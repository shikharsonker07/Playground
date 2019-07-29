import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
    int n= in.nextInt();
      int i,j;
      int large=1;
      int a[ ]=new int[n];
      for( i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
        if( a[i]>large)
        
          large=a[i];
        }
      }
      
      System.out.println (large);
        
    }
}