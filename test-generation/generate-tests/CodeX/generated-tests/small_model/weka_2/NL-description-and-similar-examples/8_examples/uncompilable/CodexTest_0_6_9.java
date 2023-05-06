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


public class CodexTest_0_6_9 { 
  @Test
    public void testGetAsInstanceShouldReturnNullWhenElementsIsNull() throws Exception {
			// given
			Instances model = new Instances(new StringReader(""));
			// when
			Instance result = instance.getAsInstance(model, new Random(42));
			// then
			assertNull(result);
		}
}