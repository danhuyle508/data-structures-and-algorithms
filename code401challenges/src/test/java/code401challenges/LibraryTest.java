/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
    public void testArrayShiftMethod(){
        int[] rightAnswer = new int[]{1,2,6,3,4,5};
        assertArrayEquals(
                "This should insert in the middle",
                rightAnswer,
                ArrayShift.arrayShift(new int[]{1,2,3,4,5}, 6));

    }
}
