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


public class CodexTest_0_9_9 { 
  @Test
  public void testMax() {
    InstanceGenerator generator = new InstanceGenerator();
    Instances dataset = generator.makeTestDataset(1000000, 0);
    double max = ((DenseInstance)dataset.instance(0)).max();
}