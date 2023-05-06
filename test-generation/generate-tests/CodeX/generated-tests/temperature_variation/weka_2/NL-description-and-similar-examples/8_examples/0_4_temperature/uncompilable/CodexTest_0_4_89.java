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


public class CodexTest_0_4_89 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"
								       + "1,2,3\n"
								       + "2,3,4\n"
								       + "3,4,5\n"
								       + "4,5,6\n"
								       + "5,6,7\n"
								       + "6,7,8\n"
								       + "7,8,9\n"
								       + "8,9,10\n"
								       + "9,10,11\n"
								       + "10,11,12\n"
								       + "11,12,13\n"
								       + "12,13,14\n"
								       + "13,14,15\n"
								       + "14,15,16\n"
								       + "15,16,17\n"
								       + "16,17,18\n"
								       + "17,18,19\n"
								       + "18,19,20\n"
								       + "19,20,21\n"
								       + "20,21,22\n"
								       + "21,22,23\n"
}