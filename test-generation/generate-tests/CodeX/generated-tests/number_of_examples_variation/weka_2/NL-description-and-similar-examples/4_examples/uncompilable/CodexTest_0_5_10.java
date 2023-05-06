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


public class CodexTest_0_5_10 { 
  @Test
    public void testGetAsInstance() {
        // given
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("X"), 0);
        model.insertAttributeAt(new Attribute("Y"), 1);
        model.insertAttributeAt(new Attribute("Z"), 2);
        model.insertAttributeAt(new Attribute("T"), 3);
        AlgVector v = new AlgVector(new double[] {2.3, 1.2, 5.0});
        Random random = new Random(0);
        // when
        Instance result = v.getAsInstance(model, random);
        // then
        assertEquals(2.3, result.value(0), 0.0);
        assertEquals(1.2, result.value(1), 0.0);
        assertEquals(5.0, result.value(2), 0.0);
        assertEquals(0, result.value(3), 0.0);
    }
}