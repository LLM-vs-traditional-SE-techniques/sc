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


public class CodexTest_0_4_85 { 
  @Test
    public void testGetAsInstance() throws Exception {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances d = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" +
					"@ATTRIBUTE A1 NUMERIC\n" +
					"@ATTRIBUTE A2 NUMERIC\n" +
					"@ATTRIBUTE A3 NUMERIC\n" +
					"@ATTRIBUTE A4 NUMERIC\n" +
					"@ATTRIBUTE A5 NUMERIC\n" +
					"@ATTRIBUTE A6 NUMERIC\n" +
					"@ATTRIBUTE A7 NUMERIC\n" +
					"@ATTRIBUTE A8 NUMERIC\n" +
					"@ATTRIBUTE A9 NUMERIC\n" +
					"@ATTRIBUTE A10 NUMERIC\n" +
					"@ATTRIBUTE A11 NUMERIC\n" +
					"@ATTRIBUTE A12 NUMERIC\n" +
					"@ATTRIBUTE A13 NUMERIC\n" +
					"@ATTRIBUTE A14 NUMERIC\n" +
					"@ATTRIBUTE A15 NUMERIC\n" +
					"@ATTRIBUTE A16 NUMERIC\n" +
					"@ATTRIBUTE A17 NUMERIC\n" +
					"@ATTRIBUTE A18 NUMERIC\n" +
					"@ATTRIBUTE A19 NUMERIC\n" +
					"@ATTRIBUTE A20 NUMERIC
}