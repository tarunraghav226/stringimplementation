import java.util.Scanner;
import caseChange.ChangeCase;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChangeCase myString= new ChangeCase(new StringBuffer(scan.next().trim()));
        myString.caseChange();
        System.out.println(myString);
    }
}
