import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_64 { 
  @Test
    /**
     * Tests if the datatype of the attribute is numeric.
     * The attribute type must be NUMERIC.
     *
     * @return true if the attribute is numeric.
     */
    public void testIsNumeric() {
	    Attribute attribute1 = new Attribute("Test");
	    assertTrue(attribute1.isNumeric());
    }
}