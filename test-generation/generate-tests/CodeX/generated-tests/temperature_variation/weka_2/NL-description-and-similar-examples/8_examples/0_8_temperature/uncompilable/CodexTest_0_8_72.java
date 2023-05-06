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


public class CodexTest_0_8_72 { 
  @Test
  public void testGetAsInstanceWithNominal() throws Exception {
		Instances instance = mock(Instances.class);
		Attribute attribute = mock(Attribute.class);
		Random random = mock(Random.class);
		Instance newInst = mock(Instance.class);
		
		int[] data = { 1, 2, 3 };
		
		when(instance.numAttributes()).thenReturn(3);
		when(instance.attribute(0)).thenReturn(attribute);
		when(instance.attribute(1)).thenReturn(attribute);
		when(instance.attribute(2)).thenReturn(attribute);
		when(newInst.value(0)).thenReturn(1);
		when(newInst.value(1)).thenReturn(2);
		when(newInst.value(2)).thenReturn(3);
		
		when(attribute.isNumeric()).thenReturn(true);
		when(attribute.numValues()).thenReturn(4);
		
		when(random.nextDouble()).thenReturn(0.1);
		
		FloatVector v = new FloatVector(data);
		Instance instance2 = v.getAsInstance(instance, random);
		
		assertEquals(newInst, instance2);
	}
 
```
}