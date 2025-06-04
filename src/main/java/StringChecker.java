import java.util.List;

public class StringChecker {


    public int getLengthScore(String input1, String input2) {

        if(input1==null ||input1.isEmpty() || input2==null ||input2.isEmpty()){
            throw new IllegalArgumentException();
        }

        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i) < 'A' ||input1.charAt(i) >'Z' ){
                throw new IllegalArgumentException();
            }
        }

        for(int i=0;i<input2.length();i++){
            if(input2.charAt(i) < 'A' ||input2.charAt(i) >'Z' ){
                throw new IllegalArgumentException();
            }
        }


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

    private Integer checkLengthSimilarity(double input1, double input2) {
        double eq=0;

        eq=(1-(double)((input1-input2)/input2))*60;
        return (int)eq;
    }
}
