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


public class CodexTest_0_2_14 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("a"), 0);
			model.insertAttributeAt(new Attribute("b"), 1);
			model.insertAttributeAt(new Attribute("c"), 2);
			model.insertAttributeAt(new Attribute("d", (FastVector) null), 3);
			model.insertAttributeAt(new Attribute("e", (FastVector) null), 4);
			model.insertAttributeAt(new Attribute("f", (FastVector) null), 5);
			model.insertAttributeAt(new Attribute("g", (FastVector) null), 6);
			model.insertAttributeAt(new Attribute("h", (FastVector) null), 7);
			model.insertAttributeAt(new Attribute("i", (FastVector) null), 8);
			model.insertAttributeAt(new Attribute("j", (FastVector) null), 9);
			model.insertAttributeAt(new Attribute("k", (FastVector) null), 10);
			model.insertAttributeAt(new Attribute("l", (FastVector) null), 11);
			model.insertAttributeAt(new Attribute("m", (FastVector) null), 12);
			model.insertAttributeAt(new Attribute("n", (FastVector) null), 13);
			model.insertAttributeAt(new Attribute("o", (FastVector) null), 14);
			model.insertAttributeAt(new Attribute("p", (FastVector) null), 15);
			model.insertAttributeAt(new Attribute("q", (FastVector) null), 16);
			model.insertAttributeAt(new Attribute("r", (FastVector) null), 17);
			model.insertAttributeAt(new Attribute("s", (FastVector) null),
}