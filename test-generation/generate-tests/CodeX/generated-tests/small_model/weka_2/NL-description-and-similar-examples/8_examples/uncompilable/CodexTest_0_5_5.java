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


public class CodexTest_0_5_5 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithCorrectValues() {
    double[] data = {1, 2, 3, 4, 5, 6};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances("test", new Attribute[] {
      new Attribute("attr1"),
      new Attribute("attr2"),
      new Attribute("attr3"),
      new Attribute("attr4"),
      new Attribute("attr5"),

}