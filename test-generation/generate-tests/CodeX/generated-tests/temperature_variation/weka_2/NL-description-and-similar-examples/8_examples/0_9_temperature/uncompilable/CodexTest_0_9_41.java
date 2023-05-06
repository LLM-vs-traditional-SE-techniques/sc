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


public class CodexTest_0_9_41 { 
  @Test
	public void testGetAsInstanceNominal() throws Exception {
		Instance inst = new DenseInstance(2);
		inst.setDataset(Dataset.dense(new DenseMatrix(new double[][] { { 0,
				0 }, { 1, 1 }, { 2, 2 } }), new DenseVector(new double[] { 0,
				0, 0 }), Arrays.asList(new Attribute("nom"),
				new Attribute("num"))));
		Random random = new Random();
		AlgVector av = new AlgVector(new double[] { 0, 1 });
		assertEquals(av.getAsInstance(inst.dataset(), random).value(0),
				inst.value(0));
	}
	
Input: public static void register(Map<String,String> props) {
    		props.put(Inflector.PLURAL_RULES, ResourceBundle.class.getName());
    		props.put(Inflector.SINGULAR_RULES, ResourceBundle.class.getName());
    	}
Output: public void testCreateInitializer() {
			Map<String, String> params = new HashMap<String, String>();
			InflectionProperties.register(params);
			assertNotNull(InflectionProperties.createInitializer(params));
		}
}