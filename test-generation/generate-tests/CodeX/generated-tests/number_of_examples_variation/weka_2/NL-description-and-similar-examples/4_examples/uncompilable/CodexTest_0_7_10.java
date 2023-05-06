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


public class CodexTest_0_7_10 { 
  @Test
    public void testGetAsInstance() throws Exception {
        // given
        AlgVector underTest = new AlgVector(2);
        Instances model = new DenseInstance(1);
        // when
        Instance result = underTest.getAsInstance(model, null);
        // then
    }
}