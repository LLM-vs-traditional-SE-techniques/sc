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


public class CodexTest_0_8_93 { 
  @Test
    assertEquals("numAttributes incorrect",
		3, inst.numAttributes());
    assertEquals("weight incorrect",
		1, inst.weight(), EPSILON);
    assertEquals("value incorrect",
		0, inst.value(0), EPSILON);
    assertEquals("value incorrect",
		1, inst.value(1), EPSILON);
    assertEquals("value incorrect",
		0, inst.value(2), EPSILON);

}