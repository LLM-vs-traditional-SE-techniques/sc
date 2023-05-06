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


public class CodexTest_0_8_70 { 
  @Test
    public void testHasClass() {
		Instance instance = new DenseInstance(4);
		assertFalse(instance.classIndex() == 2);
	}
}