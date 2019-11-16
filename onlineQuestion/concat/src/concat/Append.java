package concat;

public class Append {
    private StringBuffer string;
    public Append(StringBuffer string){this.string=string;}

    public void doAppend(String s1,String s2){
        string.append(" "+s1).append(" "+s2);
    }

    @Override
    public String toString(){return string.toString();}
}
