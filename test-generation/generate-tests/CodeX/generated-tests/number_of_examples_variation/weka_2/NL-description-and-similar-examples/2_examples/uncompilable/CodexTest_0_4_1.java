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


public class CodexTest_0_4_1 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int len = 3;
    AlgVector v = new AlgVector(len);
    for (int i = 0; i < len; i++)
      v.setElement(i, i);
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"
								       "1,1,1\n"
								       "2,2,2\n"
								       "3,3,3\n"
								       "4,4,4\n"
								       "5,5,5\n"
								       "6,6,6\n"
								       "7,7,7\n"
								       "8,8,8\n"
								       "9,9,9\n"
								       "10,10,10\n"
								       "11,11
}