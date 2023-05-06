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


public class CodexTest_0_1_6 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("A"), 0);
			model.insertAttributeAt(new Attribute("B"), 1);
			model.insertAttributeAt(new Attribute("C"), 2);
			model.insertAttributeAt(new Attribute("D", (FastVector) null), 3);
			model.insertAttributeAt(new Attribute("E", (FastVector) null), 4);
			model.insertAttributeAt(new Attribute("F", (FastVector) null), 5);
			model.insertAttributeAt(new Attribute("G", (FastVector) null), 6);
			model.insertAttributeAt(new Attribute("H", (FastVector) null), 7);
			model.insertAttributeAt(new Attribute("I", (FastVector) null), 8);
			model.insertAttributeAt(new Attribute("J", (FastVector) null), 9);
			model.insertAttributeAt(new Attribute("K", (FastVector) null), 10);
			model.insertAttributeAt(new Attribute("L", (FastVector) null), 11);
			model.insertAttributeAt(new Attribute("M", (FastVector) null), 12);
			model.insertAttributeAt(new Attribute("N", (FastVector) null), 13);
			model.insertAttributeAt(new Attribute("O", (FastVector) null), 14);
			model.insertAttributeAt(new Attribute("P", (FastVector) null), 15);
			model.insertAttributeAt(new Attribute("Q", (FastVector) null), 16);
			model.insertAttributeAt(new Attribute("R", (FastVector) null), 17);
			model.insertAttributeAt(new Attribute("S", (FastVector) null),
}