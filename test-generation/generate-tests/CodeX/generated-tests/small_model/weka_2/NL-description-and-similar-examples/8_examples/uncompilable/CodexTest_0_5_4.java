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


public class CodexTest_0_5_4 { 
    @Test
    public void testGetAsInstance_shouldReturnNullIfElementsIsNull() {
        // given
        Dataset<Instance> dataset = createDatasetWith4Attributes();
        Instance newInst = null;
        // when
        newInst = dataset.getAsInstance(new Random());
        // then
        assertNull(newInst);
    }
}