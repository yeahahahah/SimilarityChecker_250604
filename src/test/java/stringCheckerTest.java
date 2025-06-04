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
    void getLengthScoreSameLength() {
        String input1="ASD";
        String input2="DSA";
        int expected=60;


        int actual = app.getLengthScore(input1,input2);
        assertEquals(actual,expected);
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

}