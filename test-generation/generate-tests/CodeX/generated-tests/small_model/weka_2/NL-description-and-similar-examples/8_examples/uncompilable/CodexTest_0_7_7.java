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


public class CodexTest_0_7_7 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] values = { 1.0, 0.0, 0.0 };
    Instances data = new Instances(new BufferedReader(
      new StringReader("@RELATION MyRelation\n"
        + "@ATTRIBUTE class {0, 1}\n"
        + "@ATTRIBUTE numeric {0.0, 1.0}\n"
        + "@ATTRIBUTE nominal {0
}