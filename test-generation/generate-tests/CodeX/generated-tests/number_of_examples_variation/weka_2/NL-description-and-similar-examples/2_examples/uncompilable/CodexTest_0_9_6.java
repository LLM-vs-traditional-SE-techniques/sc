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
  public void testGetAsInstanceFail() {
	    Instances dataset;
	    double[] data = {2.3, 1.2, 5.0};
	    AlgVector v = new AlgVector(data);
	    try {
	      dataset = (new weka.core.converters.ConverterUtils.DataSource("foo/bar/file_not_found.txt")).getDataSet();
	      v.getAsInstance(dataset, new Random());
	      fail("Should have thrown an exception because of incompatible Input");
	    } catch (Exception ignored) {}
	  }
```
}