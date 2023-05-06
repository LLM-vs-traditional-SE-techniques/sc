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


public class CodexTest_0_1_3 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithNumericValues() {
    // given
    Instance newInst = null;
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances("test", new Attribute[] {
      new Attribute("a", data.length),
      new Attribute("b", data.length),
      new Attribute("c",
}