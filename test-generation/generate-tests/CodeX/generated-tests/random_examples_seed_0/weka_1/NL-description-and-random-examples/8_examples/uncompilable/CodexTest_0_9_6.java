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


public class CodexTest_0_9_6 { 
  @Test
      public void testCloneWithRangeInSameArray() {
			Vector1D v = new Vector1D(1);
			Vector1D vc = (Vector1D) v.clone();
			assertEquals(v, vc);
			assertNotSame(v, vc);
			assertSame(v.getClass(), vc.getClass());
		}
}