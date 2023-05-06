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


public class CodexTest_0_2_50 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			Instances inst = new Instances(new FastVector(), new FastVector());
			inst.insertAttributeAt(new Attribute("a"), 0);
			inst.insertAttributeAt(new Attribute("b"), 1);
			inst.insertAttributeAt(new Attribute("c"), 2);
			inst.insertAttributeAt(new Attribute("d"), 3);
			inst.insertAttributeAt(new Attribute("e"), 4);
			inst.insertAttributeAt(new Attribute("f"), 5);
			inst.insertAttributeAt(new Attribute("g"), 6);
			inst.insertAttributeAt(new Attribute("h"), 7);
			inst.insertAttributeAt(new Attribute("i"), 8);
			inst.insertAttributeAt(new Attribute("j"), 9);
			inst.insertAttributeAt(new Attribute("k"), 10);
			inst.insertAttributeAt(new Attribute("l"), 11);
			inst.insertAttributeAt(new Attribute("m"), 12);
			inst.insertAttributeAt(new Attribute("n"), 13);
			inst.insertAttributeAt(new Attribute("o"), 14);
			inst.insertAttributeAt(new Attribute("p"), 15);
			inst.insertAttributeAt(new Attribute("q"), 16);
			inst.insertAttributeAt(new Attribute("r"), 17);
			inst.insertAttributeAt(new Attribute("s"), 18);
			inst.insertAttributeAt(new Attribute("t"), 19);
			inst.insertAttributeAt(new Attribute("u"), 20);
			inst.insertAttributeAt(new Attribute("v"), 21);
			inst.insertAttributeAt(new Attribute("w"), 22);
			inst.insertAttributeAt(new Attribute("x"), 23);
			inst.insertAttributeAt
}