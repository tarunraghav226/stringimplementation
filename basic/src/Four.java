public class Four{
    private String string;
    public Four(String string) {
        this.string=string;
    }
    @Override
    public String toString(){
        int k=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<string.length();i++){
            for(int j=0;j<vowel.length();j++){
                if(string.charAt(i)==vowel.charAt(j)){
                    if(k==0){
                        string= string.substring(0,i)+"*"+string.substring(i+1);
                        k=1;
                    }
                    else if(k==1){
                        string= string.substring(0,i)+"^"+string.substring(i+1);
                        k=2;
                    }
                    else{
                        string= string.substring(0,i)+"!"+string.substring(i+1);
                        k=0;
                    }
                    break;
                }
            }
        }
        return string;
    }
}
