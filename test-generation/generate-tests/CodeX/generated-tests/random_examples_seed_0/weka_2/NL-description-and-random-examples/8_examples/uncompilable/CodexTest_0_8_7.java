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


public class CodexTest_0_8_7 { 
  @Test
    public void testGetAsInstance_fail_0() throws Exception {
        Random random = new Random(5);
        Instances model = new DenseInstances(0);
        DenseInstance[] instances;
        Instance newInst;
        DenseInstance[] results;
        
        model.setClassIndex(0);
        instances = new DenseInstance[0];
        instances[0] = new DenseInstance(10);
        instances[0].setDataset(model);
        instances[0].setValue(0, (double) 0.025622074652082051);
        instances[0].setValue(1, (double) 0.78146864214066073);
        instances[0].setValue(2, (double) 0.12253815334330291);
        instances[0].setValue(3, (double) 0.30517094027952262);
        instances[0].setValue(4, (double) 0.70055381926286855);
        instances[0].setValue(5, (double) 0.83907965891051054);
        instances[0].setValue(6, (double) 0.99625878735336414);
        instances[0].setValue(7, (double) 0.81900877709663318);
        instances[0].setValue(8, (double) 0.28157580677226211);
        instances[0].setValue(9, (double) 0.9278294014829815);
        instances[1] = new DenseInstance(10);
        instances[1].setDataset(model);
        instances[1].setValue(0, (double) 0.76667006959160336);
        instances[1].setValue(1, (double) 0.99404088951289066);
        instances[1].setValue(2, (double) 0.75525934121026593);
        instances[1].setValue(3, (double) 0.82460893543370825);
        instances[1].setValue(4, (double
}