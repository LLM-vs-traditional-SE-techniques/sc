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


public class CodexTest_0_9_9 { 
  @Test
  void testCheckMultiplyAddEqualValue() {
		assertEquals("add(1) value not correct", v1.getElement(1) + v2.getElement(1), v1.add(v2).getElement(1), 0.0001);
	}
}