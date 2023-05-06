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


public class CodexTest_0_9_2 { 
  @Test
   /**
   * Tests whether the method returns the same value for
   * x+y as for y+x (hence it is commutative)
   */
  public void testCommutativeAdd() {
	AlgVector a = new AlgVector(new double[] { 1, 0, 0 });
	AlgVector b = new AlgVector(new double[] { 0, 1, 0 });
	AlgVector c = new AlgVector(new double[] { 0, 0, 1 });
	AlgVector d = new AlgVector(new double[] { 1, 1, 1 });
	AlgVector r = a.add(b).add(c);
	assertTrue("Commutative add", d.equals(r));
  }
```
Above are a few test generation examples from the current version of AIDE as you can see AIDE produces at times very specific tests for API methods, but a few of the other tests demonstrate more just coverage. For example the ```testAdd_whenAddingEdgeRootMustBeSet``` in the second test example tests a pre-condition that is clear to a developer. Specifically that an Edge can not be add to a path until the root was set.
}