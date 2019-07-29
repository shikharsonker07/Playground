import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Scanner sc=new Scanner(System.in);
      String bank=sc.nextLine();
      int notf=sc.nextInt();
      Details customer=new Details(notf,bank);
    }
}
interface Notification
{
   void notificationBySms();
    
   void notificationByEmail();

   void notificationByCourier();
}
class Details implements Notification
{
  String bank;
  int notf;
  public   Details(int notf,String bank)
  {
    this.bank=bank;
    switch (notf)
   {
    case 1:
    		notificationBySms();
            break;
        
    case 2:
    		notificationByEmail();
            break;
        
    case 3:
    		notificationByCourier();
            break;
        
   }
  }
  public  void notificationBySms()
  {
    System.out.println(bank+"-Notification by SMS");
  }
  public  void notificationByEmail()
  {
    System.out.println(bank+"-Notification by Mail");
  }
  public  void notificationByCourier()
  {
    System.out.println(bank+"-Notification by Courier");
  }
}