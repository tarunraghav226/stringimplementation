import java.util.Scanner;
import palindrome.Pal;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next().trim();
        Pal myString=new Pal(string);
        if(myString.isPalindrome())
            System.out.println("Yes It Is Palindrome String");
        else
            System.out.println("No It Is Not Palindrome String");
    }
}
