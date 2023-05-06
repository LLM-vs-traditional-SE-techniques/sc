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


public class CodexTest_0_4_5 { 
  @Test
    public void testGetAsInstance() {
        int numAttributes = 4;
        Instances model = new Instances("test", new ArrayList<Attribute>(), numAttributes);
        model.insertAttributeAt(new Attribute("a1"), 0);
        model.insertAttributeAt(new Attribute("a2"), 1);
        model.insertAttributeAt(new Attribute("a3"), 2);
        model.insertAttributeAt(new Attribute("a4"), 3);
        AlgVector v = new AlgVector(model.numAttributes());
        Instance newInst = null;
        try {
            newInst = v.getAsInstance(model, new Random(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("Dataset differs", model, newInst.dataset());
        assertEquals("Attribute differs", model.attribute(0), newInst.attribute(0));
        assertEquals("Attribute differs", model.attribute(1), newInst.attribute(1));
        assertEquals("Attribute differs", model.attribute(2), newInst.attribute(2));
        assertEquals("Attribute differs", model.attribute(3), newInst.attribute(3));
    }
}