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


public class CodexTest_0_7_67 { 
    @Test
	public final void testGetAsInstance() {
		try {
			Instances model = TestInstances.makeTestInstances();
			AlgVector vector = new AlgVector();
			vector.getAsInstance(model, new Random(1));
			fail("Datatypes not compatible.");
		} catch (Exception e) {
			assertTrue(e.getMessage().equals("Datatypes are not compatible."));
		}
	}
}