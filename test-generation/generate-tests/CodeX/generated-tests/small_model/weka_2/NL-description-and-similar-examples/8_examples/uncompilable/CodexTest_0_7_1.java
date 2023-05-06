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


public class CodexTest_0_7_1 { 
        @Test
        public void testGetAsInstance() throws Exception {
            // given
            Instance instance = new DenseInstance(5);
            instance.setDataset(new InstanceHeader(5));
            instance.setValue(0, 0);
            instance.setValue(1, 1);
            instance.setValue(2, 2);
            instance.setValue(3, 3);
            instance.setValue(4, 4);
            // when
            Alg
}