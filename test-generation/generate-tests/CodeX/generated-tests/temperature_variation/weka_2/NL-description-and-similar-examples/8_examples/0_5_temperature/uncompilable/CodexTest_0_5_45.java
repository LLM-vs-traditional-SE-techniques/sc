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


public class CodexTest_0_5_45 { 
  @Test(expected = Exception.class)
  public void testGetAsInstance() {
    // Given
    AlgVector algVector = new AlgVector(new double[] {1.0, 2.0});
    Instances instances = new Instances(null, new ArrayList<Attribute>(), 1);
    instances.setClassIndex(0);
    instances.add(new DenseInstance(2));
    Random random = new Random();
}