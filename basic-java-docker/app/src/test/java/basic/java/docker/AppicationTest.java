/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basic.java.docker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test void appHasAGreeting() {
        Application classUnderTest = new Application();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
