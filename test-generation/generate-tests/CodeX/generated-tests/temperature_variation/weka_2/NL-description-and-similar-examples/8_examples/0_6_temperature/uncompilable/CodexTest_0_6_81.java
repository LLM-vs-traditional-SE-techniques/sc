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


public class CodexTest_0_6_81 { 
  @Test
    public void testGetAsInstanceNominal() throws Exception {
		Instance inst;
		Instances model = new Instances(new BufferedReader(new StringReader(
				"@RELATION myRel\n"
						+ "@ATTRIBUTE A {a1,a2,a3,a4}\n"
						+ "@ATTRIBUTE B {b1,b2,b3,b4}\n"
						+ "@ATTRIBUTE C {c1,c2,c3,c4}\n"
						+ "@DATA\n" + "0,0,0\n" + "1,1,1\n" + "2,2,2\n"
						+ "3,3,3\n")));
		model.setClassIndex(2);
}