public class Five {
    private String string;
    private String subString;
    Five(String string,String subString){
        this.string=string;
        this.subString=subString;
    }

    @Override
    public String toString(){
    return string.replace(subString,"!");
    }
}
