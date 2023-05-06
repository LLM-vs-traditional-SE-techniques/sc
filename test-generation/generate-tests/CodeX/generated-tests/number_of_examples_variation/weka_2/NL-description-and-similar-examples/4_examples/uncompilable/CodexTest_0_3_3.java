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


public class CodexTest_0_3_3 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "@RELATION test\n" +
									  "@ATTRIBUTE a numeric\n" +
									  "@ATTRIBUTE b numeric\n" +
									  "@ATTRIBUTE c numeric\n" +
									  "@ATTRIBUTE d numeric\n" +
									  "@ATTRIBUTE e numeric\n" +
									  "@ATTRIBUTE f numeric\n" +
									  "@DATA\n" +
									  "1,2,3,4,5,6\n" +
									  "7,8,9,10,11,12\n" +
									  "13,14,15,16,17,18\n" +
									  "19,20,21,22,23,24\n" +
									  "25,26,27,28,29,30\n" +
									  "31,32,33,34,35,36\n" +
									  "37,38,39,40,41,42\n" +
									  "43,44,45,46,47,48\n" +
									  "49,50,51,52,53,54\n" +
									  "55,56,57,58,59,60\n" +

}