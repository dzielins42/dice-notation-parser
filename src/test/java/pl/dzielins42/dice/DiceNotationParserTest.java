package pl.dzielins42.dice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DiceNotationParserTest extends TestCase {

    private static final int SAMPLE = 10000;

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
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("1d2");
            assertTrue(value >= 1 && value <= 2);
        }
    }

    public void testSingleD6Roll() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("1d6");
            assertTrue(value >= 1 && value <= 6);
        }
    }

    public void testSingleD1000Roll() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("1d1000");
            assertTrue(value >= 1 && value <= 1000);
        }
    }

    public void testMultipleD10Rolls() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("10d10");
            assertTrue(value >= 01 && value <= 100);
        }
    }

    public void testDefaultRollNumber() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("d10");
            assertTrue(value >= 1 && value <= 10);
        }
    }

    public void testCorrectRollSeparator() {
        DiceNotationParser.eval("1D10");
        DiceNotationParser.eval("1d10");
    }

    public void testAddition() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("d10+25");
            assertTrue(value >= 26 && value <= 35);
        }
    }

    public void testSubstraction() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("d10-10");
            assertTrue(value >= -9 && value <= 0);
        }
    }

    public void testMultiplication() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("d10*100");
            assertTrue(value >= 100 && value <= 1000);
        }
    }

    public void testAdvancedMath() {
        int value;
        for (int i = 0; i < SAMPLE; i++) {
            value = DiceNotationParser.eval("(d10+30)*100");
            assertTrue(value >= 3100 && value <= 4000);
            value = DiceNotationParser.eval("d10+30*100");
            assertTrue(value >= 3001 && value <= 3010);
        }
    }

}
