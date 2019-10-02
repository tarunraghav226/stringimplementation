public class Ten {
    private String string;
    private char c;


    Ten(String string,char c){
        this.string=string;
        this.c=c;
    }

    @Override
    public String toString(){
        return String.valueOf(string.indexOf(c));
    }
}
