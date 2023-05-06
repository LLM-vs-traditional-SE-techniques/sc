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


public class CodexTest_0_3_92 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(
						      new StringReader(
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
								       "1,2,3,4,5,6\n" +
								       "a,b,c,d,e,f\n" +
		
}