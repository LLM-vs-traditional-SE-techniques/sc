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


public class CodexTest_0_4_77 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "X1,X2,Y\n" + "1.0,2.0,3.0\n" + "2.0,3.0,4.0\n" + "3.0,4.0,5.0\n"
                        + "4.0,5.0,6.0\n" + "5.0,6.0,7.0\n" + "6.0,7.0,8.0\n"
                        + "7.0,8.0,9.0\n" + "8.0,9.0,10.0\n" + "9.0,10.0,11.0\n"
                        + "10.0,11.0,12.0\n" + "11.0,12.0,13.0\n" + "12.0,13.0,14.0\n"
                        + "13.0,14.0,15.0\n" + "14.0,15.0,16.0\n" + "15.0,16.0,17.0\n"
                        + "16.0,17.0,18.0\n" + "17.0,18.0,19.0\n" + "18.0,19.0,20.0\n"
                        + "19.0,20.0,21.0\n" + "20.0,21.0,22.0\n")));
        Random r = new Random(1);
        AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
        Instance i = v.getAsInstance(model, r);
        assertEquals("X1", i.attribute(0).name());
        assertEquals("X2", i.attribute(1).name());
        assertEquals("Y", i.attribute(2).name());
        assertEquals(1.0, i.value(0), 1e-6);

}