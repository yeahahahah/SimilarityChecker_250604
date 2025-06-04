import java.util.List;

public class StringChecker {

    public List<String> getInput(Object str1) {

        if(str1==null){
            throw new IllegalArgumentException();
        }
        return null;
    }

    public int getLengthScore(String input1, String input2) {
        if(input1.length()==input2.length()){
            return 60;
        }
        double eq=0;
        double longInput;
        double shortInput;
        if(input1.length()>input2.length()){
            longInput= input1.length();
            shortInput=input2.length();

        }else{
            longInput= input2.length();
            shortInput=input1.length();
        }
        eq=(1-(longInput-shortInput)/shortInput)*60;

        return (int)eq;

    }
}
