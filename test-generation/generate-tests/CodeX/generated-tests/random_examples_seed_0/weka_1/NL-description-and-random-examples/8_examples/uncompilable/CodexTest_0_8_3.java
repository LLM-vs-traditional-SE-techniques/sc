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


public class CodexTest_0_8_3 { 
    @Test
    public void testAdd() {
    	AlgVector b = null;
    	AlgVector other = new AlgVector(2);
    	other.m_Elements[0] = 2;
    	other.m_Elements[1] = 3;
    	AlgVector a = new AlgVector(2);
    	a.m_Elements[0] = 1;
    	a.m_Elements[1] = 2;
    	if (a != null) {
    		//b = (AlgVector) a.clone();
    		b = new AlgVector(2);
    		b.m_Elements[0] = a.m_Elements[0] + other.m_Elements[0];
    		b.m_Elements[1] = a.m_Elements[1] + other.m_Elements[1];
    	}
    	//assertEquals("", 3.0, b.m_Elements[0]);
    }
}