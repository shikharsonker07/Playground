import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
      int temp=0;
      int arr[]=new int [len];
      for(int i=0;i<len;i++)
        {
        	arr[i]=sc.nextInt();
        }
      int k=sc.nextInt();
      int c=0;
      for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
              if(c==k)
              {
                break;
              }
            }
        
        if(c==k)
              {
                break;
              }
        c++;
        }
      for(int i=0;i<len;i++)
        {
        	if(i==k-1)
            {
              System.out.println(arr[i]);
            }
        	
        }
    }   
}