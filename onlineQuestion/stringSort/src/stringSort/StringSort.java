package stringSort;

import java.util.Arrays;

public class StringSort {
    private String string;
    public StringSort(String string){this.string=string;}
    public String sortString(){
        char []charArr=string.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
