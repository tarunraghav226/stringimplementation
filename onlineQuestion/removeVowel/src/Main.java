import removeVowel.RemoveVowel;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        RemoveVowel string =new RemoveVowel(scan.next().trim());
        System.out.println(string.removeVowel());
    }
}
