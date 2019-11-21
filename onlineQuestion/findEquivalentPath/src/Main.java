import findEquivalentPath.FindEquivalentPath;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        FindEquivalentPath string=new FindEquivalentPath(scan.next().trim());
        System.out.println(string.equivalentPath());
    }
}
