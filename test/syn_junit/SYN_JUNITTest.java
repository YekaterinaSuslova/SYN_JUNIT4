package syn_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static syn_junit.SYN_JUNIT.myDiv;

public class SYN_JUNITTest {
    @Test
    public void test1MyDiv() throws Exception {
        assertTrue(myDiv(0, 3, 3) == 1);
    }

    @Test
    public void test2MyDiv() throws Exception {
        try {
            assertTrue("Проверка деления на 0", myDiv(1, 0, 0) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        try {
            assertTrue("Проверка деления 0 на 0", myDiv(0, 0, 0) == 0);
            fail("Нет ошибки при делении 0 на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}
