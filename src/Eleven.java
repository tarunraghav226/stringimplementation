public class Eleven {
    private String string;
    private char c;

    Eleven(String string, char c){
        this.string=string;
        this.c=c;
    }

    @Override
    public String toString(){
        String indexes="";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==c)
                indexes+=i+"\n";
        }
        return  indexes;
    }
}
