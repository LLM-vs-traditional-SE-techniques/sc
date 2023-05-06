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


public class CodexTest_0_9_4 { 
  @Test
    public void test1() throws Exception {
    Random random = new Random();
    Instances model = new Instances(new BufferedReader(new StringReader(
            "id, v1, v2, v3\n"
                    + "String, numeric, numeric, numeric\n"
                    + "1, 666, 666, 666")));
    Instance inst = makeInstance(model, random);
    /*
     * assertEquals(666, inst.value(0)); assertEquals(666, inst.value(1));
     * assertEquals(666, inst.value(2));
     */
    // System.out.println(inst);
}

}