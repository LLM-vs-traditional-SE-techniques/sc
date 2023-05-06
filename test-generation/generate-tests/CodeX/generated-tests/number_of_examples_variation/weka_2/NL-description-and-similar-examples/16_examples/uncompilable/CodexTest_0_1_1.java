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


public class CodexTest_0_1_1 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
																	   "A,B,C,D\n" +
																	   "0,1,2,3\n" +
																	   "1,2,3,4\n" +
																	   "2,3,4,5\n" +
																	   "3,4,5,6\n" +
																	   "4,5,6,7\n" +
																	   "5,6,7,8\n" +
																	   "6,7,8,9\n" +
																	   "7,8,9,10\n" +
																	   "8,9,10,11\n" +
																	   "9,10,11,12\n" +
																	   "10,11,12,13\n" +
																	   "11,12,13,14\n" +
																	   "12,13,14,15\n" +
																	   "13,14,15,16\n" +
						
}