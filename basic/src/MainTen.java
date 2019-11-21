import java.util.Scanner;
public class MainTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ten obj = new Ten(scan.nextLine().trim(),scan.next().charAt(0));
        System.out.println(obj.toString());
    }
}
