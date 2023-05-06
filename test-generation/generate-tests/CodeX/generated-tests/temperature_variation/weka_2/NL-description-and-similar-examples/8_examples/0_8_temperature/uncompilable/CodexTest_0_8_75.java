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


public class CodexTest_0_8_75 { 
    @Test
    public void testGetAsInstance_NominalAttribute() throws Exception {
        Attribute a = new Attribute("name", Arrays.asList("A", "B", "C"));
        Instances m = new Instances("test", Collections.singletonList(a), 0);
        AlgVector a2 = new AlgVector(new double[]{1.0});
        Random r = new Random();
        Instance i = a2.getAsInstance(m, r);
        assertEquals("Instances do not match", m, i.dataset());
        assertEquals("Value does not match", 0.0, i.value(0), 0.0);
    }
}