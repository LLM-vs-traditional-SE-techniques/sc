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


public class CodexTest_0_9_6 { 
  @Test
    public void testGetAsInstance() {
        DescentDescent descent = new DescentDescent();
        DescentDescent descent2 = new DescentDescent();
        descent.setDescentDescent(descent2);
        assertSame("2nd descent object is not the same as 1st", descent2, descent.getDescentDescent());
    }
*/
}