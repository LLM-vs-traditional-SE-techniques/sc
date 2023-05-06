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


public class CodexTest_0_2_1 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithNumericValues() {
    // given
    Instance expected = new DenseInstance(1);
    expected.setDataset(new InstanceDataset(new Attribute("test", 0)));
    expected.setValue(0, 1.0);
    AlgVector vector = new AlgVector(new double[] {1.0});
    // when
    Instance actual = vector.getAsInstance(new InstanceDat
}