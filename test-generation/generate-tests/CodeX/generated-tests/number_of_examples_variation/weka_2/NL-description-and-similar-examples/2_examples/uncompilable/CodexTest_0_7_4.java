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


public class CodexTest_0_7_4 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // set up data
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "@@relation my_data\n"+
								       "\n"+
								       "@attribute a1 numeric\n"+
								       "@attribute a2 numeric\n"+
								       "@attribute a3 numeric\n"+
								       "\n"+
								       "@data\n"+
								       "0, 0, 1\n"+
								       "1, 2, 3\n"+
								       "2, 4, 5\n"+
								       "3, 6, 7\n")));
    // set up random number generator
    Random random = new Random(0);
    // create vector
    AlgVector v = new AlgVector(new double[] {2.3, 1.2, 5.0});
    // create instance
    Instance inst = v
}