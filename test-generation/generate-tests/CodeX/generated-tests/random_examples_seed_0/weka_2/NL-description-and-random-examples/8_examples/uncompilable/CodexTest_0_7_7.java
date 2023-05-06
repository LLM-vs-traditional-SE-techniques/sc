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


public class CodexTest_0_7_7 { 
  @Test
    public void testGetAsInstance() {
			Instance newInst = new Instance();
			Random random = new Random();
			DenseInstance dI = new DenseInstance(newInst, random);
			assertTrue(dI instanceof DenseInstance);
		}
}