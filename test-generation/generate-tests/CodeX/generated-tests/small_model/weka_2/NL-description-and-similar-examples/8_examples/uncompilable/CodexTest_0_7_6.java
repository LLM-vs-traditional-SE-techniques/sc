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


public class CodexTest_0_7_6 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instance inst = new DenseInstance(3);
        inst.setDataset(new Instances("testInst", new Attribute[]{
            new Attribute("attr1",0),
            new Attribute("attr2",1),
            new Attribute("attr3",2)}, 0));
        inst.setValue(0, new Double(1.0));
        inst.setValue(1, new
}