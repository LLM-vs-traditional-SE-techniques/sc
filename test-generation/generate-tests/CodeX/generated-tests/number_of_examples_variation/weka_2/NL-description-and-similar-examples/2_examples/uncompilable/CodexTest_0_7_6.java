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


public class CodexTest_0_7_6 { 
  @Test
  public void testGetAsInstance() {
    try {
      int numAtts = 5;
      int numVals = 3;
      // create array of doubles
      double[] data = new double[numAtts-numVals];
      // create mock of random
      Random r = createNiceMock(Random.class);
      expect(r.nextDouble()).andReturn(0.0).times(numVals);
      replay(r);
      // create mock of Instances
      Instances mockInstances = createNiceMock(Instances.class);
      expect(mockInstances.numAttributes())
        .andReturn(numAtts).times(3);
      for (int i = 0; i < numAtts; i++) {
        Attribute a;
        if (i < numAtts-numVals)
          a = createNiceMock(Attribute.class);
        else
          a = createMock(Attribute.class);
        expect(a.isNumeric()).andReturn(i < numAtts-numVals).times(3);
        expect(a.isNominal()).andReturn(i >= numAtts-numVals).times(3);
        expect(mockInstances.attribute(i)).andReturn(a).times(
}