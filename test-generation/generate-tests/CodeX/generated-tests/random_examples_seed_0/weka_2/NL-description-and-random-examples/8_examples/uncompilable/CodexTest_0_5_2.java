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


public class CodexTest_0_5_2 { 
  @Test
    public void testGetAsInstance() {
        Instance instance = null;
        Random random = new Random();
        instance = new DenseInstance(3);
        instance.setDataset(null);
        instance.setValue(0, 0.0);
        instance.setValue(1, 1.0);
        instance.setValue(2, 2.0);
        Assert.assertEquals(instance, instance.getAsInstance(model, random));
    }
}