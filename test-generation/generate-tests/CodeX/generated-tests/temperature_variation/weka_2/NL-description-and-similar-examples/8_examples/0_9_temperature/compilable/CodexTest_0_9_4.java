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


public class CodexTest_0_9_4 { 
  @Test
    public void testProgram() throws Exception {
        FastVector attributes = new FastVector();
        attributes.addElement(new Attribute("a"));
        attributes.addElement(new Attribute("b"));
        Instances dataSet = new Instances("Test", attributes, 0);
        double[] vector = {1.1, 2.1};
        Instance in = new DenseInstance(dataSet.numAttributes());
         in.setValue(0, vector[0]);
         in.setValue(1, vector[1]);
        System.out.println(in);
    }
}