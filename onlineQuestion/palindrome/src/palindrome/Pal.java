package palindrome;

public class Pal {
    private String string;
    public Pal(String string){this.string=string;}

    public boolean isPalindrome(){
        int indexFromLast;
        int counter=0;
        for(int i=0;i<string.length();i++){
            indexFromLast=string.length()-1;
            indexFromLast-=i;
            if(string.charAt(i)!=string.charAt(indexFromLast))
                counter++;
            if(counter>0)
                return false;
        }
        return true;
    }
}
