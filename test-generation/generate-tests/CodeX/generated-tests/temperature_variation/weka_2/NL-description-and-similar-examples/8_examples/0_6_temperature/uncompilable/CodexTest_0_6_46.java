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


public class CodexTest_0_6_46 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances insts = new Instances(new BufferedReader(new StringReader(
    "@relation test\n"
    + "@attribute a1 numeric\n"
    + "@attribute a2 numeric\n"
    + "@attribute a3 numeric\n"
    + "@data\n"
    + "1 2 3\n"
    + "2 3 4\n"
    + "3 4 5\n"
    )));
    assertTrue("Datatypes are not compatible.", 
	       v.getAsInstance(insts, new Random(1)).dataset() == insts);
  }
}