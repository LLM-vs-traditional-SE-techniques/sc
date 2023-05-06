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


public class CodexTest_0_8_73 { 
  @Test
  public void testGetAsInstanceNominal() {
    try {
      int numInstances = 100;
      int numAttributes = 3;
      Instances dataset = generateDataset(numInstances, numAttributes);
      AlgVector v = new AlgVector(numAttributes);
      v.setElement(0, 1.0);
      v.setElement(1, 1.0);
      v.setElement(2, 0.0);
      Instance newInst = v.getAsInstance(dataset, new Random(5));
}