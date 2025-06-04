import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class stringCheckerTest {

    private StringChecker app;
    @BeforeEach
    void setUp() {
        app= new StringChecker();
    }





    @Test
    void getLengthScoreDiff1() {
        String input1="AAABB";
        String input2="BAA";
        int expected=20;


        int actual = app.getLengthScore(input1,input2);
        assertEquals(expected,actual);
    }

    @Test
    void getLengthScoreDiff2() {
        String input1="A";
        String input2="BB";
        int expected=0;
        int actual = app.getLengthScore(input1,input2);
        assertEquals(expected,actual);
    }

    @Test
    void getLengthScoreDiff3() {
        String input1="AA";
        String input2="AAE";
        int expected=30;
        int actual = app.getLengthScore(input1,input2);
        assertEquals(expected,actual);
    }

    @Test
    void getLengthScoreDiff4() {
        String input1="AA";
        String input2="AAEEE";
        int expected=0;
        int actual = app.getLengthScore(input1,input2);
        assertEquals(expected,actual);
    }

}