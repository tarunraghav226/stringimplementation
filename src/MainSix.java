import java.util.Scanner;
public class MainSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Six obj = new Six(scan.nextLine().trim());
        System.out.print(obj.toString());
    }
}
