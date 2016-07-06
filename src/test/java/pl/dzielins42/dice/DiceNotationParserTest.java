package pl.dzielins42.dice;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

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

    public void testSimpleRoll() {
        ANTLRInputStream in = new ANTLRInputStream("1d6");
        DiceNotationLexer lexer = new DiceNotationLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiceNotationParser parser = new DiceNotationParser(tokens);
        int value = parser.eval().value;
        System.out.println(value);
        assertEquals(value, 6);
    }

}
