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


public class CodexTest_0_5_73 { 
  @Test
  public void testRandom() {
    AlgVector v = new AlgVector(new double[]{1.0, 1.0, 1.0, 1.0});
    Instances instances = new Instances(new FastVector(), new FastVector());
    instances.insertAttributeAt(new Attribute(a), 0);
    instances.insertAttributeAt(new Attribute(b), 1);
    instances.insertAttributeAt(new Attribute(c), 2);
    instances.insertAttributeAt(new Attribute(d), 3);
    instances.insertAttributeAt(new Attribute(e), 4);
    instances.insertAttributeAt(new Attribute(f), 5);
    instances.insertAttributeAt(new Attribute(g), 6);
    instances.insertAttributeAt(new Attribute(h), 7);
    instances.insertAttributeAt(new Attribute(i), 8);
    instances.insertAttributeAt(new Attribute(j), 9);
    instances.insertAttributeAt(new Attribute(k), 10);
    instances.insertAttributeAt(new Attribute(l), 11);
    instances.insertAttributeAt(new Attribute(m), 12);
    instances.insertAttributeAt(new Attribute(n), 13);
    instances.insertAttributeAt(new Attribute(o), 14);
    instances.insertAttributeAt(new Attribute(p), 15);
    instances.insertAttributeAt(new Attribute(q), 16);
    instances.insertAttributeAt(new Attribute(r), 17);
    instances.insertAttributeAt(new Attribute(s), 18);
    instances.insertAttributeAt(new Attribute(t), 19);
    instances.insertAttributeAt(new Attribute(u), 20);
    instances.insertAttributeAt(new Attribute(v), 21);
    instances.insertAttributeAt(new Attribute(w), 22);
    instances.insertAttributeAt(new Attribute(x), 23);
    instances.insertAttributeAt(new Attribute(y), 24);
    instances.insertAttributeAt(new Attribute(z), 25);
    Instance inst = v.getAsInstance(instances, new Random(1));
    assertEquals(inst
}