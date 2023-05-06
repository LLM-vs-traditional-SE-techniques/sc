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


public class CodexTest_0_8_3 { 
  @Test
    public void testAdd() {
        double[] data = {1, 2, 3};
        AlgVector a = new AlgVector(data);
        AlgVector b = a.add(a);
        for (int i = 0; i < data.length; i++)
            assertEquals((i + 1) + ". value differs", 2 * data[i], b.getElement(i));
    }
}