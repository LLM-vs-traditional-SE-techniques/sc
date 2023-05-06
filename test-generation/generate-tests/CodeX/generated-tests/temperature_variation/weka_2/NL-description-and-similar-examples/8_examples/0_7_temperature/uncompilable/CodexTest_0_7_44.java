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


public class CodexTest_0_7_44 { 
  @Test
    public void testGetAsInstanceShouldThrowExceptionWhenInstanceTypeIsNotCompatible() throws Exception {
        // given
        AlgVector vector = new AlgVector(new double[] { 1, 2, 3, 4, 5 });
        Instances dataset = new Instances(new BufferedReader(new StringReader("@relation test\n@attribute a {1,2,3}\n@attribute b numeric\n@data\n1,3.0\n")));
}