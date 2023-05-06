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
    public void testNumAttributes(){
        Instances instances = new Instances("test",attributes,1);
        instances.setClassIndex(0);
        assertEquals(7, model.numAttributes());
        assertEquals("numeric", instances.attribute(0).toString());
        assertEquals("numeric", instances.attribute(1).toString());
        assertEquals("numeric", instances.attribute(2).toString());
        assertEquals("numeric", instances.attribute(3).toString());
        assertEquals("numeric", instances.attribute(4).toString());
        assertEquals("numeric", instances.attribute(5).toString());
        assertEquals("numeric", instances.attribute(6).toString());
    }
}