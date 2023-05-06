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


public class CodexTest_0_5_8 { 
  @Test
    public void testGetAsInstanceShouldReturnInstanceWithNumericValues() {
        // arrange
        double[] data = new double[] { 2.3, 1.2, 5.0 };
        AlgVector vector = new AlgVector(data);
        Instances model = new Instances(new StringReader(
            "1.0 2.0 3.0\n"));
        // act
        Instance inst = vector.getAsInstance(model, new Random(1));
       
}