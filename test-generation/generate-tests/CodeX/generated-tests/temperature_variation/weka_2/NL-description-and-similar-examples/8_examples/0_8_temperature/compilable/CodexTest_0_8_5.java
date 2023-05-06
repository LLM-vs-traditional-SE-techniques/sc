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


public class CodexTest_0_8_5 { 
  @Test
    public void testGetAsInstance_NominalZero() {
        SparseInstance instance = new SparseInstance(0, new double[]{});
        Assert.assertEquals(0, instance.numValues());
    }
}