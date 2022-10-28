import org.example.urinals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    @Test
    public void validStringTest()
    {
        System.out.println("========= vamsi kolapalli == TEST ONE EXECUTED =========");
        urinals urinal=new urinals();
        String test="01000";
        assertTrue(urinal.validString(test));
    }
    @Test
    public void validStringTest_1()
    {
        System.out.println("========= vamsi kolapalli == TEST TWO EXECUTED =========");
        urinals urinal=new urinals();
        String test="0111";
        assertFalse(urinal.validString(test));
    }
    @Test
    public void validStringTest_2()
    {
        System.out.println("========= vamsi kolapalli == TEST THREE EXECUTED =========");
        urinals urinal=new urinals();
        assertTrue(urinal.validString(null));
    }
    @Test
    public void validStringTest_3()
    {
        System.out.println("========= vamsi kolapalli == TEST FOUR EXECUTED =========");
        urinals urinal=new urinals();
        String test="1100";
        assertFalse(urinal.validString(test));
    }

    @Test
    public void countUrinalsTest()
    {
        System.out.println("========= vamsi kolapalli == TEST FIVE EXECUTED =========");
        urinals urinal=new urinals();
        String test="10001";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_1()
    {
        System.out.println("========= vamsi kolapalli == TEST SIX EXECUTED =========");
        urinals urinal=new urinals();
        String test="00000";
        assertEquals(3,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_2()
    {
        System.out.println("========= vamsi kolapalli == TEST SEVEN EXECUTED =========");
        urinals urinal=new urinals();
        String test="01000";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_3()
    {
        System.out.println("========= vamsi kolapalli == TEST EIGHT EXECUTED =========");
        urinals urinal=new urinals();
        String test="011";
        assertEquals(-1,urinal.countUrinals(test));
    }









}


