import  java.util.Scanner;
public class MainEleven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Eleven obj = new Eleven(scan.nextLine().trim(),scan.next().trim().charAt(0));
        System.out.println(obj.toString());
    }
}
