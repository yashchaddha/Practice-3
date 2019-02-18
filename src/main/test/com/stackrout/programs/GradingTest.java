import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradingTest {

    com.stackroute.practice3.Grading studentMarks;
    @Before
    public void setUp() throws Exception {
        studentMarks= new com.stackroute.practice3.Grading();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expected="All marks are correct";
        int array[]={62,23,34};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class",expected,actual);
    }
    @Test
    public void checkFailure() {
        String expected="Error";
        int array[]={62,23,134};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class",expected,actual);
    }
}