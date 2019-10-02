import java.util.Scanner;
public class MainFive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Five obj = new Five(scan.next().trim(),scan.next().trim());
        System.out.println(obj.toString());

    }
}
