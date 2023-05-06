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


public class CodexTest_0_7_6 { 
  @Test
        public void testGetAsInstance() {
			
			Instances data = new Instances(new BufferedReader(new StringReader(Daten)));
			Instance ins = data.instance(0);
			Random random = new Random(1);
			Instance result = filter.getAsInstance(data, random);
			assertEquals(ins.toString(), result.toString());
			
			Instance result2 = filter.getAsInstance(data.instance(0), random);
			assertEquals(ins.toString(), result2.toString());
		}
}