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


public class CodexTest_0_1_18 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n" +
								       "1,2,3\n" +
								       "4,5,6\n" +
								       "7,8,9\n" +
								       "10,11,12\n" +
								       "13,14,15\n" +
								       "16,17,18\n" +
								       "19,20,21\n" +
								       "22,23,24\n" +
								       "25,26,27\n" +
								       "28,29,30\n" +
								       "31,32,33\n" +
								       "34,35,36\n" +
								       "37,38,39\n" +
								       "40,41,42\n" +
								       "43,44,45\n" +
								       "46,47,48\n" +
								       "49,50,51\n" +
								       "52,53,54\n" +
								       "55,56,57\n" +
								       "58,59,60\n" +
								       "61,62,63\n" +
								       "64,65,66\n" +
								       "67
}