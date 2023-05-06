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


public class CodexTest_0_4_5 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instance newInst = new DenseInstance(4);
      newInst.setDataset(new InstanceHeader(new Instances(
              "TestInstances", new FastVector(4), 0)));
      newInst.setValue(0, 1.0);
      newInst.setValue(1, 2.0);
      newInst.setValue(2, 3.0);
      new
}