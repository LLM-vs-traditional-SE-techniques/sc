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


public class CodexTest_0_2_8 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" + "1,2,3\n" + "4,5,6\n")));
        Instance instance = new Instance(3);
        instance.setDataset(model);
        instance.setValue(0, 1);
        instance.setValue(1, 2);
        instance.setValue(2, 3);
        Random random = new Random(1);
        Instance newInstance = instance.getAsInstance(model, random);
        assertEquals(instance, newInstance);
    }
}