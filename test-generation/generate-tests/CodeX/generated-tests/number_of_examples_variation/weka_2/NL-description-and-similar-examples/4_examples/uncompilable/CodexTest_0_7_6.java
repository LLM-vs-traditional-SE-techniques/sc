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
        // given
        AlgVector algVector = new AlgVector(new double[]{2.3, 1.2, 5.0});
        ArrayList<Attribute> atts = new ArrayList<Attribute>(3);
        atts.add(new Attribute("att1"));
        atts.add(new Attribute("att2"));
        atts.add(new Attribute("att3"));
        Instances dataset = new Instances("dataset", atts, 0);
        // when
        Instance instance = algVector.getAsInstance(dataset, new Random());
        // then
        assertEquals(0, instance.numAttributes());
    }
}