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


public class CodexTest_0_8_1 { 
  @Test
    public void testGetAsInstance() {//TODO Auto-generated
        Instances data0 = null;
        Random random = null;
        //UndirectedEdge fixture = getFixture();
        Instance result = this.getFixture().getAsInstance(data0, random);
        assertNotNull(result);
        // add additional test code here
    }

}