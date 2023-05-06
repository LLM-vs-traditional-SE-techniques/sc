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


public class CodexTest_0_7_4 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValuesSet() {
    // given
    Attribute a = new Attribute("x");
    DenseInstance newInst = new DenseInstance(1);
    newInst.setDataset(new Instances("test", new Attribute[]{a}, 0));
    // when
    double[] values = {2, 3};
    newInst.setValue(0, values);
    Node n = new Node(newInst);
   
}