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


public class CodexTest_0_4_2 { 
  @Test
    public void testRandomize() {
    int numInstances = 100;
    int numAttributes = 10;
    Instances data = makeTestDataset(numInstances, numAttributes);
    Random random = new Random(1);
    for (int i = 0; i < data.numInstances(); i++) {
      data.instance(i).randomize(random);
    }
    check(data);
  }
}