public class Nine {
    private String string;
    private int upperWeight;
    private int lowerWeight;

    Nine(String string){
        this.string=string;
        lowerWeight=0;
        upperWeight=0;
    }

    @Override
    public String toString(){
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=65&&string.charAt(i)<=90)
                upperWeight+= string.charAt(i);
        }

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=97&&string.charAt(i)<=122)
                lowerWeight+= string.charAt(i);
        }
        return String.valueOf(Math.abs(upperWeight-lowerWeight));
    }
}
