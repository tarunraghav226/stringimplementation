public class Seven {
    private String string;
    private int totalWeight;
    Seven(String string){
        this.string=string;
        totalWeight=0;
    }
    @Override
    public String toString(){
        for(int i= 0;i<string.length();i++){
            totalWeight+=string.charAt(i);
        }
        return String.valueOf(totalWeight);
    }
}
