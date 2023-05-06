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


public class CodexTest_0_9_61 { 
    @Test
    public void testGetAsInstance() throws Exception {
        TIntArrayList indices = new TIntArrayList();
        for (int i=0; i<4; i++) {
            indices.add(i);
        }
        double[] values = new double[] {1, 2, 3, 4};
        WekaAlgVector vector = new WekaAlgVector(indices, values);
        Instances instances = InstanceBuilder.builder()
                .attribute("att1", 0, 1, 2)
                .attribute("att2", 1, 2, 3)
                .attribute("att3", 2, 3, 4)
                .attribute("att4", 3, 4, 5)
                .build();
        assertEquals(0, vector.getAsInstance(instances, random()).value(0));
        assertEquals(2, vector.getAsInstance(instances, random()).value(1));
        assertEquals(4, vector.getAsInstance(instances, random()).value(2));
        assertEquals(0, vector.getAsInstance(instances, random()).value(3));
    }
}