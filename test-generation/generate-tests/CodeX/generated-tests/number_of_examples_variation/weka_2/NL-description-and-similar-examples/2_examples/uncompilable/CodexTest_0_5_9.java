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


public class CodexTest_0_5_9 { 
  @Test
  public void testGetAsInstance() {
    try {
      double [] data = {2.3, 1.2, 5.0};
      AlgVector v = new AlgVector(data);
      Instances model = new Instances(new BufferedReader(
				       new StringReader(
					 "Test, 0, 1\n" +
					 "1, 2.3, 1.2\n" +
					 "2, 2.3, 1.2\n" +
					 "3, 2.3, 1.2\n" +
					 "4, 2.3, 1.2\n" +
					 "5, 2.3, 1.2\n" +
					 "6, 2.3, 1.2\n" +
					 "7, 2.3, 1.2\n" +
					 "8, 2.3, 1.2\n" +
					 "9, 2.3, 1.2\n" +
					 "10, 2.3, 1.2\n" +
					 "11, 2.3,
}