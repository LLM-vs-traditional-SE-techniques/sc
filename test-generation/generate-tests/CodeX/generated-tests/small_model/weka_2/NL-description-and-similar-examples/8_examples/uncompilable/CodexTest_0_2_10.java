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


public class CodexTest_0_2_10 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithNumericValues() {
    // given
    Instance newInst = null;
    double[] values = {1.0, 2.0, 3.0};
    AlgVector vector = new AlgVector(values);
    Instances model = new Instances("Test", new Attribute[] {
      new Attribute("a", new ArrayList<String>()),
      new Attribute("b", new ArrayList<String>()),
}