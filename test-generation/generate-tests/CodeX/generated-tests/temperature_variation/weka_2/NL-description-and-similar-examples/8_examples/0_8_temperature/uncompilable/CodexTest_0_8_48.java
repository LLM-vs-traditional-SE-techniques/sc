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


public class CodexTest_0_8_48 { 
    @Test
    public void SetValue_shouldUpdateInstanceValue_whenCalled() throws Exception {
			int numOfAttrib = 2;
			double[] elms = new double[numOfAttrib];
			elms[0] = 1.5;
			elms[1] = 2.5;
			AlgVector vec = new AlgVector(elms);
			Instances model = new Instances(new FastVector(), 1);
			model.add(new Instance(1.0, elms));
			Random random = new Random(1);
			Instance newInst = vec.getAsInstance(model, random);
			double[] elms2 = new double[numOfAttrib];
			elms2[0] = 3.5;
			elms2[1] = 4.5;
			vec.setValue(elms2);
			Instances model2 = new Instances(new FastVector(), 1);
			model2.add(new Instance(1.0, elms2));
			Instance newInst2 = vec.getAsInstance(model2, random);
			assertEquals(newInst.value(0), newInst2.value(0), 0.0);
			assertEquals(newInst.value(1), newInst2.value(1), 0.0);
		}
}