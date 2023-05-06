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


public class CodexTest_0_8_8 { 
    @Test(expected = AlgebraException.class)
	public void addTest() throws CloneNotSupportedException {
		AlgVector obj = new AlgVector(4);
		AlgVector vector = new AlgVector(4);
		vector.add(obj);
	}
}