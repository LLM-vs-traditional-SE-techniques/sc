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


public class CodexTest_0_8_52 { 
    @Test
    public void testCompareConstructor() {
	AlgMatrix matrix3 = new AlgMatrix(matrix2);
	
	assertEquals("equals must be true", matrix2, matrix3);
	assertNotSame("equals must be false", matrix2, matrix3);
    }
}