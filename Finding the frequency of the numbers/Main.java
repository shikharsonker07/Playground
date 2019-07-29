import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
	  int k=sc.nextInt();
      int result[]=new int[k+1];
      int index=0;
      int arr[]=new int [len];
      for(int i=0;i<len;i++)
        {
        	arr[i]=sc.nextInt();
        }
      for(int i=0;i<k+1;i++)
        {
        	result[i]=0;
        }
      for(int i=0;i<len;i++)
      {
        result[arr[i]]++;
      }
      for(int i=1;i<k+1;i++)
      {
        System.out.println(i+" "+result[i]);
      }
    }   
}