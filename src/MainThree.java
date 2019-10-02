import java.util.Scanner;
public class MainThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Three obj = new Three(scan.nextLine().trim());
        System.out.println(obj.toString());
    }
}