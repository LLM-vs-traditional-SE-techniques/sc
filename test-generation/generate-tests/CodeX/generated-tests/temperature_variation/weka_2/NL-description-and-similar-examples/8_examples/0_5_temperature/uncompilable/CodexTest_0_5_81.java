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


public class CodexTest_0_5_81 { 
  @Test
    public void testGetAsInstance() {
        AlgVector vector = new AlgVector(new double[]{1.0, 2.0});
        Instances model = null;
        Random random = null;
        try {
            vector.getAsInstance(model, random);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            assertEquals("Datatypes are not compatible.", ex.getMessage());
        } catch (Exception ex) {
            fail("IllegalArgumentException expected");
        }
        model = new Instances(new StringReader("@relation test\n@attribute a numeric\n@attribute b numeric\n@attribute c numeric\n@data\n1,2,3\n4,5,6\n"));
        try {
            vector.getAsInstance(model, random);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            assertEquals("Datatypes are not compatible.", ex.getMessage());
        } catch (Exception ex) {
            fail("IllegalArgumentException expected");
        }
    }
}