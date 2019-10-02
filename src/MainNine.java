import java.util.Scanner;
public class MainNine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Nine obj = new Nine(scan.nextLine().trim());
        System.out.println(obj.toString());
    }
}
