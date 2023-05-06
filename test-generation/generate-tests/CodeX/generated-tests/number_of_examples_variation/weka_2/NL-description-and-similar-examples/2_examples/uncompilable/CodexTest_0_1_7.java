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


public class CodexTest_0_1_7 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "A,B,C\n" +
									  "0,1,2\n" +
									  "1,2,3\n" +
									  "2,3,4\n" +
									  "3,4,5\n" +
									  "4,5,6\n" +
									  "5,6,7\n" +
									  "6,7,8\n" +
									  "7,8,9\n" +
									  "8,9,0\n" +
									  "9,0,1\n")));
      double[] data = {2.3, 1.2, 5.0};
      AlgVector v = new AlgVector(data);
      Instance
}