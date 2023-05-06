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


public class CodexTest_0_6_1 { 
  @Test
    public void testGetAsInstanceShouldReturnNullWhenEmpty() {
		// given
		AlgVector vector = new AlgVector();
		// when
		Instance result = vector.getAsInstance(null,null);
		// then
		assertNull(result);
	}
}