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


public class CodexTest_0_5_7 { 
  @Test
    public void testGetAsInstance() {
			try {
				double[] data = {2.3, 1.2, 5.0};
				AlgVector v = new AlgVector(data);
				Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" +
					"@attribute att1 numeric\n" +
					"@attribute att2 numeric\n" +
					"@attribute att3 numeric\n" +
					"@data\n" +
					"1.0,2.0,3.0\n" +
					"4.0,5.0,6.0\n" +
					"7.0,8.0,9.0\n"
				)));
				model.setClassIndex(model.numAttributes() - 1);
				Random random = new Random(1);
				Instance newInst = v.getAsInstance(model, random);
				assertEquals("Datatypes are not compatible.", data[0], newInst.value(0));
				assertEquals("Datatypes are not compatible.", data[1], newInst.value(1));
				assertEquals("Datatypes are not compatible.", data[2], newInst.value(2));
			} catch (Exception e) {
				fail(e.getMessage());
			}
		}

}