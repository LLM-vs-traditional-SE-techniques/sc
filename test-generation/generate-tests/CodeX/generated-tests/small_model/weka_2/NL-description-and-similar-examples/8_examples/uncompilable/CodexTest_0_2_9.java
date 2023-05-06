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


public class CodexTest_0_2_9 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithNumericValues() {
    // given
    AlgVector vector = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
    Instances model = new Instances("test", new Attribute[] {
      new Attribute("attr1", 0), new Attribute("attr2", 1) }, 0);
    // when
    Instance result = vector.getAsInstance(model, new Random(1));
}