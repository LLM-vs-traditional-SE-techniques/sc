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


public class CodexTest_0_6_10 { 
    @Test
    public void getAsInstance() {
        double[] data = {1, 2, 3};
        AlgVector vector = new AlgVector(data);
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("first");
        attributes.add(attribute);
        attribute = new Attribute("second");
        attributes.add(attribute);
        attribute = new Attribute("third");
        attributes.add(attribute);
        Instances instances = new Instances("test", attributes, 0);
        Random random = new Random();
        try {
            Instance instance = vector.getAsInstance(instances, random);
            assertEquals(data[0], instance.value(0), 0.0001);
            assertEquals(data[1], instance.value(1), 0.0001);
            assertEquals(data[2], instance.value(2), 0.0001);
        } catch (Exception e) {
            fail();
        }
    }
}