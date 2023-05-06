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


public class CodexTest_0_9_77 { 
  @Test
    public void testDenseInstanceConstructor() {
    Instances data = makeTestInstances();
    Random random = new Random(42);
    DataGenerator generator = new DataGenerator();
    Instance inst = generator.getAsInstance(data, random);
    for (int i = 0; i < data.numAttributes(); i++) {
      if (data.attribute(i).isNominal()) {
        // Categories not guaranteed...
        assertTrue(inst.value(i) >= 0);
        assertTrue(inst.value(i) < data.attribute(i).numValues());
      } else {
        assertEquals(i + 1, inst.value(i), 1e-6);
      }
    }
    assertTrue((inst.dataset() != null));
  }
    
- **Suggest a test for a method with the public static void walkFileSystem(Path start, ? extends FileVisitor<? super Path>) throws IOException signature.**
}