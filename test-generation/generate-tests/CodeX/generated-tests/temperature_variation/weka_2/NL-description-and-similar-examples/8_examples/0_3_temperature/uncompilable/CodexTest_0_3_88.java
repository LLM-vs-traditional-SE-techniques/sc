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


public class CodexTest_0_3_88 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "A,B,C,D,E\n" +
								       "0,1,2,3,4\n" +
								       "5,6,7,8,9\n" +
								       "10,11,12,13,14\n" +
								       "15,16,17,18,19\n" +
								       "20,21,22,23,24\n" +
								       "25,26,27,28,29\n" +
								       "30,31,32,33,34\n" +
								       "35,36,37,38,39\n" +
								       "40,41,42,43,44\n" +
								       "45,46,47,48,49\n" +
								       "50,51,52,53,54\n" +
								       "55,56,57,58,59\n" +
								       "60,61,62,63,64\n" +
								       "65,66,67,68,69\n" +
								       "70,71,72,73,74\n" +
								       "75,76,77,78,79\n" +
								       "80,81,82,83,84\n" +
								       "85,86,87,88,89\n" +
								       "90,91,92
}