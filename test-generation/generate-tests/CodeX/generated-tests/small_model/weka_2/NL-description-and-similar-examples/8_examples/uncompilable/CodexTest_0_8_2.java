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


public class CodexTest_0_8_2 { 
  @Test
    public void createTestForGetAsInstance(Instances model, Random rnd)
        throws Exception {
        Instance newInst = getAsInstance(model, rnd);
        assertNotNull(newInst);
        boolean found = false;
        for (int i = 0; i < model.numInstances(); i++) {
            if (newInst.value(0) == model.instance(i).value(0)) {
                found = true;
                break;
            }
}