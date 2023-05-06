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


public class CodexTest_0_3_27 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new StringReader(
					"@RELATION test\n"
					+ "@ATTRIBUTE attr1 NUMERIC\n"
					+ "@ATTRIBUTE attr2 NUMERIC\n"
					+ "@ATTRIBUTE attr3 NUMERIC\n"
					+ "@ATTRIBUTE attr4 NUMERIC\n"
					+ "@ATTRIBUTE attr5 NUMERIC\n"
					+ "@ATTRIBUTE attr6 NUMERIC\n"
					+ "@ATTRIBUTE attr7 NUMERIC\n"
					+ "@ATTRIBUTE attr8 NUMERIC\n"
					+ "@ATTRIBUTE attr9 NUMERIC\n"
					+ "@ATTRIBUTE attr10 NUMERIC\n"
					+ "@ATTRIBUTE attr11 NUMERIC\n"
					+ "@ATTRIBUTE attr12 NUMERIC\n"
					+ "@ATTRIBUTE attr13 NUMERIC\n"
					+ "@ATTRIBUTE attr14 NUMERIC\n"
					+ "@ATTRIBUTE attr15 NUMERIC\n"
					+ "@ATTRIBUTE attr16 NUMERIC\n"
					+ "@ATTRIBUTE attr17 NUMERIC\n"
					+ "@ATTRIBUTE attr18 NUMERIC\n"
					+ "@ATTRIBUTE attr19 NUMERIC\n"
					+ "@ATTRIBUTE attr20 NUMERIC\n"
			
}