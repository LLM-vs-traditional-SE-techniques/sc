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


public class CodexTest_0_8_97 { 
  @Test
    assertEquals("Instance size differs", 1, instance.numAttributes());
    assertEquals("Class index differs", 1, instance.classIndex());
    assertEquals("Class attribute differs", "class1", instance.classAttribute().toString());
    assertEquals("Class attribute not at index", instance.classAttribute(), instance.attribute(1));
    assertEquals("Weka class differs", "weka.core.DenseInstance", instance.getClass().getName());
    assertTrue("Instance is missing first attribute", instance.attribute(0) != null);
    assertTrue("Instance is missing class attribute", instance.classAttribute() != null);
    assertEquals("Name of first attribute differs", "first", instance.attribute(0).name());
    assertEquals("Number of values of first attribute differs", 0, instance.attribute(0).numValues());
    assertEquals("First attribute is NOT numeric", Attribute.NUMERIC, instance.attribute(0).type());
    assertEquals("Value of first attribute differs", 1.0, instance.value(0), EPSILON);
    assertEquals("Missing value for first attribute", false, instance.isMissing(0));
    assertEquals("Number of missing values differs", 0, instance.numMissingAttributes());
    assertEquals("Number of instance weights differs", 1, instance.numValues());
    assertEquals("Values of instance weights differs", 1.0, instance.valueSparse(0), EPSILON);
    assertEquals("Value of class attribute differs", 0.0, instance.classValue(), EPSILON);
    assertEquals("Missing value for class attribute", false, instance.isMissing(1));
    assertEquals("Missing value for class attribute", false, instance.classIsMissing());
"""
}