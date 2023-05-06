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


public class CodexTest_0_5_4 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {2.3, 1.2, 5.0});
      Instances model = new Instances(new BufferedReader(
				       new StringReader(
							"\n@RELATION test\n" +
							"\n@ATTRIBUTE A1 NUMERIC\n" +
							"\n@ATTRIBUTE A2 NUMERIC\n" +
							"\n@ATTRIBUTE A3 NUMERIC\n" +
							"\n@ATTRIBUTE A4 NUMERIC\n" +
							"\n@ATTRIBUTE A5 NUMERIC\n" +
							"\n@ATTRIBUTE A6 NUMERIC\n" +
							"\n@ATTRIBUTE A7 NUMERIC\n" +
							"\n@ATTRIBUTE A8 NUMERIC\n" +
							"\n@ATTRIBUTE A9 NUMERIC\n" +
							"\n@ATTRIBUTE A10 NUMERIC\n" +
							"\n@ATTRIBUTE A11 NUMERIC\n" +
							"\n@ATTRIBUTE A12 NUMERIC\n" +
							"\n@ATTRIBUTE A13 NUMERIC\n" +
							"\n@ATTRIBUTE A14 NUMERIC\n" +
							"\n@ATTRIBUTE A15 NUMERIC\n" +
							"\n@ATTRIBUTE A16 NUMERIC\n" +
							"\n@ATTRIB
}