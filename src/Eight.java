public class Eight {
    private String string;
    private int upperWeight;
    Eight(String string){
        this.string=string;
        upperWeight=0;
    }
    @Override
    public String toString(){
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=65&&string.charAt(i)<=90)
                upperWeight+= string.charAt(i);
        }
        return String.valueOf(upperWeight);
    }
}
