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


public class CodexTest_0_6_3 { 
  @Test
    public void test_getAsInstance_shouldReturnInstanceWithAllValues() {
        // given
        Instance expected = null;
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instances model = new Instances("test", new Attribute[]{
            new NumericAttribute("0"), new NumericAttribute("1"),
            new NumericAttribute("2")}, 0);
        // when
        Instance result
}