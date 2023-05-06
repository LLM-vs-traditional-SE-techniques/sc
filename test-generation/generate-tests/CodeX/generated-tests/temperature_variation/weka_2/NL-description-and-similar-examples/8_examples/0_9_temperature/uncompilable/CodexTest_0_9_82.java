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


public class CodexTest_0_9_82 { 
  @Test
        void getAsInstance() throws Exception{
            DenseInstance a = new DenseInstance(1);
            a.setDataset(new Instances(new ArrayList<>(), 1));
            assertNotNull(AlgVector.getAsInstance(a, new Random(9)));
        }
}