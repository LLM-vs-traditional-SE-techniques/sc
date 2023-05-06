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


public class CodexTest_0_1_50 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new StringReader(
					"@RELATION test\n" +
					"@ATTRIBUTE a NUMERIC\n" +
					"@ATTRIBUTE b NUMERIC\n" +
					"@ATTRIBUTE c NUMERIC\n" +
					"@ATTRIBUTE d NUMERIC\n" +
					"@ATTRIBUTE e NUMERIC\n" +
					"@ATTRIBUTE f NUMERIC\n" +
					"@ATTRIBUTE g NUMERIC\n" +
					"@ATTRIBUTE h NUMERIC\n" +
					"@ATTRIBUTE i NUMERIC\n" +
					"@ATTRIBUTE j NUMERIC\n" +
					"@ATTRIBUTE k NUMERIC\n" +
					"@ATTRIBUTE l NUMERIC\n" +
					"@ATTRIBUTE m NUMERIC\n" +
					"@ATTRIBUTE n NUMERIC\n" +
					"@ATTRIBUTE o NUMERIC\n" +
					"@ATTRIBUTE p NUMERIC\n" +
					"@ATTRIBUTE q NUMERIC\n" +
					"@ATTRIBUTE r NUMERIC\n" +
					"@ATTRIBUTE s NUMERIC\n" +
					"@ATTRIBUTE t NUMERIC\n" +
					"@ATTRIBUTE u NUMERIC\n" +
		
}