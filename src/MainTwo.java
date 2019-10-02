import java.util.Scanner;
public class MainTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Two obj = new Two(scan.nextLine().trim(),scan.nextInt());
        System.out.println(obj.toString());
    }
}
