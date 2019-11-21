import java.util.Scanner;
public class MainSeven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Seven obj =new Seven(scan.nextLine().trim());
        System.out.println("Total Weight = "+obj.toString());
    }
}
