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


public class CodexTest_0_4_4 { 
  @Test
    public void testGetAsInstanceShouldReturnInstanceWhenModelIsNumeric() {
        // given
        Instance newInst = null;
        Instance expectedInst = new DenseInstance(2);
        expectedInst.setDataset(new Instances("test", new double[]{1, 2}));
        expectedInst.setValue(0, 1);
        expectedInst.setValue(1, 2);
        // when
        newInst = new Path(new double[]{1,
}