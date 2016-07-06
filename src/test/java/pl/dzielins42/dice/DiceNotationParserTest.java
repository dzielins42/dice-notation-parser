package pl.dzielins42.dice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DiceNotationParserTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    public DiceNotationParserTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(DiceNotationParserTest.class);
    }

    public void testSingleD2Roll() {
        int value = DiceNotationParser.eval("1d2");
        assertTrue(value >= 1 && value <= 2);
    }

    public void testSingleD6Roll() {
        int value = DiceNotationParser.eval("1d6");
        assertTrue(value >= 1 && value <= 6);
    }

    public void testSingleD1000Roll() {
        int value = DiceNotationParser.eval("1d1000");
        assertTrue(value >= 1 && value <= 1000);
    }

}
