package caseChange;

public class ChangeCase {
    private StringBuffer string;
    public ChangeCase(StringBuffer string){this.string=string;}

    public void caseChange(){
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=65 && string.charAt(i)<=90){
                string.setCharAt(i,(char)(string.charAt(i)+32));
            }
            else{
                string.setCharAt(i,(char)(string.charAt(i)-32));
            }
        }
    }
    @Override
    public String toString(){
        return string.toString();
    }
}
