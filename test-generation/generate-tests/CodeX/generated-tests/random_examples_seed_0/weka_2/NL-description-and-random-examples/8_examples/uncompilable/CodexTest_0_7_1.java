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


public class CodexTest_0_7_1 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new StringReader("@relation test\n@attribute a numeric\n@attribute b numeric\n"));
        Instance i = new Instance(2);
        i.setValue(0, 1.0);
        i.setValue(1, 2.0);
        Instance result = i.getAsInstance(model, new Random());
        assertNotNull(result);
        assertEquals(1.0, result.value(0), 0.0);
        assertEquals(2.0, result.value(1), 0.0);
    }
}