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


public class CodexTest_0_7_3 { 
  @Test
  public void testAddition() {
    		RandomGenerator rg = new JDKRandomGenerator();
    		rg.setSeed(1209381092039L);
    		AlgVector a1 = new AlgVector(10);
    		AlgVector a2 = new AlgVector(10);
    		AlgVector a3 = new AlgVector(10);
    		for (int i = 0; i < 10; ++i) {
    			a1.m_Elements[i] = rg.nextGaussian();
    			a2.m_Elements[i] = rg.nextGaussian();
    		}
    		for (int i = 0; i < 10; ++i) {
    			a3.m_Elements[i] = a1.m_Elements[i] + a2.m_Elements[i];
    		}
    		AlgVector a4 = a1.add(a2);
    		for (int i = 0; i < 10; ++i) {
    			assertEquals(a3.getElement(i), a4.getElement(i), 1.0e-15);
    		}
    	}
}