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
  public static void testGetAsInstance() {
        Instances model = new Instances(new ArrayList<>(Arrays.asList(new Attribute("a", Arrays.asList("1", "2")), new Attribute("b"), new Attribute("c", Arrays.asList("1", "2")))));
        AlgVector vector = new AlgVector(1, 2, 3);
        List<Object> expected = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        List<Object> actual = vector.getAsInstance(model, new Random());
}