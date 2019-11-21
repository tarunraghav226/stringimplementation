import java.util.Scanner;
public class MainOne {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        One obj =new One(scan.nextLine().trim());
        System.out.println(obj.toString());
    }
}
