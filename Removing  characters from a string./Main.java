import java.util.Scanner; 
class Main
{ 
 public static void main (String[] args)
 {
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    String input=in.nextLine();
    int input_len=input.length();
    StringBuilder str = new StringBuilder(string);
    int str_len = str.length();
    for(int index1 = 0; index1 < input_len; index1++)
    {
        for(int index2 = 0; index2 < str_len; index2++)
        {
            if(input.charAt(index1) == str.charAt(index2) )
            {
                for(int index3 = index2; index3 < str_len-1 ; index3++)
                {
                    str.setCharAt(index3, str.charAt(index3 + 1));
                }
                str_len--;
            }
        }
    }
    String str_without_duplicate = str.substring(0, str_len);
    System.out.print(str_without_duplicate);
 }
}