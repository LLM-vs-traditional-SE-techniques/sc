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


public class CodexTest_0_4_10 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@RELATION Test\n" +
									"@ATTRIBUTE A NUMERIC\n" +
									"@ATTRIBUTE B NUMERIC\n" +
									"@ATTRIBUTE C NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE D NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE E NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE F NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE G NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE H NOMINAL {1,2,3}\n" +
									"@ATTRIBUTE I NOMINAL {1,
}