public class Three {
    String string;
    public Three(String string){
        this.string=string;
    }

    @Override
    public String toString(){
        String vowel="aeiouAEIOU";
        for(int i=0;i< vowel.length();i++){
            string=string.replace(vowel.charAt(i),'*');
        }
        return string;
    }
    public int length(){return string.length();}
}
