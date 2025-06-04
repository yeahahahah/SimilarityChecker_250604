import java.util.List;

public class StringChecker {


    public int getLengthScore(String input1, String input2) {


        checkInput(input1);
        checkInput(input2);


        int len1=input1.length();
        int len2=input2.length();
        if(len1<len2){
            len2=len1;
            len1=input2.length();
        }


        if(len1==len2){
            return 60;
        }
        if(len1>=len2*2){
            return 0;
        }


        return checkLengthSimilarity(len1, len2);
    }

    private void checkInput(String str  ) {
        if(str==null ||str.isEmpty()){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) < 'A' || str.charAt(i) >'Z' ){
                throw new IllegalArgumentException();
            }
        }
    }

    private Integer checkLengthSimilarity(double input1, double input2) {
        double eq=0;

        eq=(1-(double)((input1-input2)/input2))*60;
        return (int)eq;
    }
}
