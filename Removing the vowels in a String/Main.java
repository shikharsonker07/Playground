import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		String string = sc.nextLine();
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
	}

  
}