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


public class CodexTest_0_6_4 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances d = new Instances(new BufferedReader(
				   new StringReader(
				     "Relation test\n" +
				     "  @attribute a1 numeric\n" +
				     "  @attribute a2 numeric\n" +
				     "  @attribute a3 numeric\n" +
				     "  @attribute a4 {0,1}\n" +
				     "  @attribute a5 {0,1}\n" +
				     "  @attribute a6 {0,1}\n" +
				     "  @attribute a7 {0,1}\n" +
				     "  @attribute a8 {0,1}\n" +
				     "  @attribute a9 {0,1}\n" +
				     "  @attribute a10 {0,1}\n" +
				     "  @attribute a11 {0,1}\n" +
				    
}