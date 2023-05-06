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


public class CodexTest_0_7_4 { 
    @Test
    public void testDenseInstance() {
        Random rand = new Random(42);
        Instances inst = new Instances(mock(Instances.class));
        inst.setClassIndex(0);
        AlgVector v = new AlgVector(new double[]{1,2,3});
        inst.insertAttributeAt(new Attribute("a"), 0);
        inst.insertAttributeAt(new Attribute("b"), 1);
        inst.insertAttributeAt(new Attribute("c"), 2);
        DenseInstance ins = (DenseInstance) v.getAsInstance(inst, rand);
        System.out.println(ins);
    }
}