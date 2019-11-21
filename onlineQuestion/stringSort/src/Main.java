import  java.util.Scanner;
import stringSort.StringSort;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        StringSort string = new StringSort(scan.next().trim());
        System.out.println(string.sortString());
    }
}
