import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int a[]= new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int n1 =in.nextInt();
      int n2 =in.nextInt();
      for(i=0;i<n;i++)
      {
        if(n1==a[i])
        break;
      }
      if(i==5)
      {
        System.out.println(-1);
      }
        else
        {
          System.out.println(i);
        }
      
       for(i=0;i<5;i++)
       {
        if(n2==a[i])
        break;
       }
        if(i==5)
        
          System.out.println(-1);
         else
          System.out.println(i);
       
    }
}