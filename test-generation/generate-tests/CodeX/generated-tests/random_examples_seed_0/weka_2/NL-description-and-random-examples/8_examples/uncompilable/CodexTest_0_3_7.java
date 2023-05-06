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


public class CodexTest_0_3_7 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n1,2,3\n4,5,6\n7,8,9")));
        model.setClassIndex(model.numAttributes() - 1);
        Instance newInst = new DenseInstance(model.numAttributes());
        newInst.setDataset(model);
        newInst.setValue(0, 1);
        newInst.setValue(1, 2);
        newInst.setValue(2, 3);
        Instance newInst2 = new DenseInstance(model.numAttributes());
        newInst2.setDataset(model);
        newInst2.setValue(0, 4);
        newInst2.setValue(1, 5);
        newInst2.setValue(2, 6);
        Instance newInst3 = new DenseInstance(model.numAttributes());
        newInst3.setDataset(model);
        newInst3.setValue(0, 7);
        newInst3.setValue(1, 8);
        newInst3.setValue(2, 9);
        Instance newInst4 = new DenseInstance(model.numAttributes());
        newInst4.setDataset(model);
        newInst4.setValue(0, 1);
        newInst4.setValue(1, 2);
        newInst4.setValue(2, 3);
        Instance newInst5 = new DenseInstance(model.numAttributes());
        newInst5.setDataset(model);
        newInst5.setValue(0, 4);
        newInst5.setValue(1, 5);
        newInst5.setValue(2, 6);
        Instance newInst6 = new DenseInstance(model.numAttributes());
        newInst6.setDataset(model);
        newInst6.setValue(0, 7);
        newInst6.setValue(1, 8);
        newInst6.setValue(2, 9);
        Instance newInst7 = new D
}