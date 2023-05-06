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


public class CodexTest_0_6_27 { 
    @Test
    public void testGetAsInstance() throws Exception {
        // given
        AlgVector v = new AlgVector(new double[] {1.1, 2.1, 3.1, 4.1, 5.1});
        Instances model = new Instances(new StringReader(
          "@relation test\n"
          + "@attribute a1 numeric\n"
          + "@attribute a2 numeric\n"
          + "@attribute a3 numeric\n"
          + "@attribute a4 numeric\n"
          + "@attribute a5 numeric\n"
          + "@attribute a6 numeric\n"
          + "@data\n"
          + "0,0,0,0,0,0\n"));
}