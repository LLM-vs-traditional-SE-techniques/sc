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


public class CodexTest_0_4_6 { 
  @Test
    public void testGetAsInstanceShouldReturnInstanceWithValuesFromClassInstance() throws Exception {
        // given
        Instance expected = new DenseInstance(2);
        expected.setDataset(new Instance(1.0, 2.0));
        AlgVector vector = new AlgVector(new double[]{1.0, 2.0});
        // when
        Instance result = vector.getAsInstance(new Instance(1.0, 2.0), new Random
}