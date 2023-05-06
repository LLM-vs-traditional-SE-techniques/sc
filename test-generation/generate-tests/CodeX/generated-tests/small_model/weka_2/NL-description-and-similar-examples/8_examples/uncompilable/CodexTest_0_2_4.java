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


public class CodexTest_0_2_4 { 
  @Test
    public void testGetAsInstanceShouldReturnInstanceWithValuesFromArray() {
        // given
        Instance expected = new DenseInstance(2);
        expected.setDataset(new InstanceHeader(2));
        expected.setValue(0, 2.0);
        expected.setValue(1, 1.0);
        // when
        Instance result = new AlgVector(new double[]{2.0, 1.0}).getAsInstance(new InstanceHeader
}