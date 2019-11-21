import java.util.Scanner;
public class MainFour {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Four obj = new Four(scan.nextLine().trim());
        System.out.println(obj.toString());
    }
}
