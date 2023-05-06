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


public class CodexTest_0_7_3 { 
  @Test
  public void testGetAsInstanceShouldReturnNullWhenEmptyVectorGiven() throws Exception {
    // given
    AlgVector vector = new AlgVector();
    AlgAttributes attributes = new AlgAttributes();
    attributes.add(new Attribute("x"));
    attributes.add(new Attribute("y"));
    attributes.add(new Attribute("z"));
    Instances model = new Instances("test", attributes, 10);
    // when
    Instance instance =
}