public class One {
    private String s;
    One(String s){
        this.s=s;
    }

    public String toString(){
        String index="index:\t";
        String chars="chars:\t";
        for(int i=0;i<s.length();i++){
            index+=i+"\t";
            chars+=s.charAt(i)+"\t";
        }
        return index+"\n"+chars;
    }
}
