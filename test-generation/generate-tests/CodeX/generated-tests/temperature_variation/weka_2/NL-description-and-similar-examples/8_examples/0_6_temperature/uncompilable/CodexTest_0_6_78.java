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


public class CodexTest_0_6_78 { 
    @Test(expected = Exception.class)
    public void getAsInstance_whenDatatypesAreNotCompatible() throws Exception {
        // given
        AlgVector v = new AlgVector(new double[]{1, 2, 3, 4, 5, 6});
        Instances model = createInstances();
}