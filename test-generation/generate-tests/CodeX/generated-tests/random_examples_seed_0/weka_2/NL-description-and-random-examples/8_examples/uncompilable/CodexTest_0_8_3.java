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


public class CodexTest_0_8_3 { 
    @Test
    public void testGetAsInstance() throws Exception {
    	SparseInstance instance = new SparseInstance(0);
        Instances model = new Instances(new StringReader("@relation test\n\n@attribute a {a,b,c}\n@attribute b numeric\n@attribute c numeric\n\n@data\na,1.0,1.0\nb,2.0,2.0\nc,3.0,3.0"));
        instance.setDataset(model);
        assertFalse(instance.getAsInstance(model, null).equals(instance));
        assertEquals(new SparseInstance(3), instance.getAsInstance(model, null));
    }
}