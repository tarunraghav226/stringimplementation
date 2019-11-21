public class Two {
    private String string;
    private int beginIndex;
    Two(String string,int beginIndex){
        this.string=string;
        this.beginIndex=beginIndex;
    }

    @Override
    public String toString(){
        return string.substring(beginIndex);
    }
}
