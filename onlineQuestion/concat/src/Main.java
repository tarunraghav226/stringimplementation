import concat.Append;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Append mystring = new Append(new StringBuffer(scan.next().trim()));
        mystring.doAppend(scan.next().trim(),scan.next().trim());
        System.out.println(mystring);
    }
}
