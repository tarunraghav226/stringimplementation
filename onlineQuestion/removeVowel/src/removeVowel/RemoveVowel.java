package removeVowel;

public class RemoveVowel {
    private String string;
    public RemoveVowel(String string){this.string=string;}

    public String removeVowel(){
        String vowels="aeiouAEIOU";
        char []c=string.toCharArray();
        for(int i=0;i<c.length;i++){
            if(vowels.contains(String.valueOf(c[i]))){
                c[i]=' ';
                for(int j=i;j<c.length-1;j++)
                    c[j]=c[j+1];
                c[c.length-1]=' ';
            }
        }
        return new String(c).trim();
    }
}
