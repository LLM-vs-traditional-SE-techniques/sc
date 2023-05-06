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


public class CodexTest_0_5_6 { 
    @Test
    public void testGetAsInstance() {
        // given
        double[] data = {2.3, 1.2, 5.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new FastVector(), 0);
        Attribute att = new Attribute("att1");
        model.insertAttributeAt(att, 0);
        att = new Attribute("att2");
        model.insertAttributeAt(att, 1);
        att = new Attribute("att3");
        model.insertAttributeAt(att, 2);
        // when
        Instance result = v.getAsInstance(model, new Random(42));
        // then
        assertEquals("Wrong value returned", 2.3, result.value(0), 0.0);
        assertEquals("Wrong value returned", 1.2, result.value(1), 0.0);
        assertEquals("Wrong value returned", 5.0, result.value(2), 0.0);
    }
}