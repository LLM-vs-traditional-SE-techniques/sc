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


public class CodexTest_0_7_8 { 
    @Test
	public void testGetAsInstance() throws Exception {
		// create instance with nominal attribute
		ArrayList<Attribute> fv = new ArrayList<Attribute>();
		fv.add(new Attribute("nominal"));
		Instances dataset = new Instances("test", fv, 0);
		AlgVector v = new AlgVector(1);
		v.setElement(0, 1);
		assertEquals("Nominal attribute value differs", 
			     1, v.getAsInstance(dataset, new Random()).value(0));
	}

}