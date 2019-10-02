import java.util.Scanner;
public class MainEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Eight obj = new Eight(scan.nextLine().trim());
        System.out.println("upper weight="+obj.toString());
    }
}
