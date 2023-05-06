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


public class CodexTest_0_9_13 { 
    @Test
    public void testGetAsInstance() throws Exception {
        System.out.println("getAsInstance");
        Instances data = new Instances(new StringReader(IRIS));
        data.add(new DenseInstance(1.0, new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 
        6.6}));
        Instances model = new Instances(data, 0);
        model.randomize(new Random(0));
}