package findEquivalentPath;

import java.util.Arrays;
public class FindEquivalentPath {
    private String string;

    public FindEquivalentPath(String string) {
        this.string = string;
    }

    public int count(char c){
        int count=0;
        for(char cc: string.toCharArray()){
            if(cc==c)
                count++;
        }
        return count;
    }

    public String equivalentPath() {
        StringBuffer stringg=new StringBuffer("");
        int N = count('N');
        int S = count('S');
        int W = count('W');
        int E = count('E');

        if(N-S < 0){
            for(int i=0;i<S-N;i++)
                stringg.append('S');
        }
        else{
            for(int i=0;i<N-S;i++)
                stringg.append('N');
        }

        if(E-W < 0){
            for(int i=0;i<W-E;i++)
                stringg.append('W');
        }
        else{
            for(int i=0;i<E-W;i++)
                stringg.append('E');
        }

        char []c=stringg.toString().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}