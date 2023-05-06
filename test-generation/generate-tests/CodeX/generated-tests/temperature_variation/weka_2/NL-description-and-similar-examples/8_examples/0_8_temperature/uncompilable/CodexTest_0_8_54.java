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


public class CodexTest_0_8_54 { 
  @Test
  private Instances createSimpleDataset() {
    FastVector atts = new FastVector();
    atts.addElement(new Attribute(x));
    atts.addElement(new Attribute(y));
    atts.addElement(new Attribute(z));
    Instances data = new Instances(test, atts, 2);
    data.setClassIndex(data.numAttributes() - 1);
    Instance[] instances = new Instance[2];
    instances[0] = new DenseInstance(3);
    instances[0].setValue(0, 0.4);
    instances[0].setValue(1, 0.5);
    instances[0].setValue(2, 0.6);
    instances[1] = new DenseInstance(3);
    instances[1].setValue(0, 0.6);
    instances[1].setValue(1, 0.7);
    instances[1].setValue(2, 0.8);
    data.add(instances[0]);
    data.add(instances[1]);
    return data;
  }
}