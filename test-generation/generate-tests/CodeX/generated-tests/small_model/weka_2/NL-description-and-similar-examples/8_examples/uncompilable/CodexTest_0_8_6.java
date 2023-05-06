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


public class CodexTest_0_8_6 { 
    @Test
    public void test_getAsInstanceShouldReturnNullWhenNoElements() {
        // given
        Instance newInst = null;
        Instance tester = new DenseInstance(1);
        CodeExample.AlgVector v = new CodeExample.AlgVector(newInst);
        // when
        Instance result = v.getAsInstance(tester, null);
        // then
        assertEquals("Did not return null instance", result, null);

}