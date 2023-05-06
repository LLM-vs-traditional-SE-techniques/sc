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


public class CodexTest_0_1_15 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("A1"), 0);
			model.insertAttributeAt(new Attribute("A2"), 1);
			model.insertAttributeAt(new Attribute("A3"), 2);
			model.insertAttributeAt(new Attribute("A4", (FastVector) null), 3);
			model.insertAttributeAt(new Attribute("A5", (FastVector) null), 4);
			model.insertAttributeAt(new Attribute("A6", (FastVector) null), 5);
			model.insertAttributeAt(new Attribute("A7", (FastVector) null), 6);
			model.insertAttributeAt(new Attribute("A8", (FastVector) null), 7);
			model.insertAttributeAt(new Attribute("A9", (FastVector) null), 8);
			model.insertAttributeAt(new Attribute("A10", (FastVector) null), 9);
			model.insertAttributeAt(new Attribute("A11", (FastVector) null), 10);
			model.insertAttributeAt(new Attribute("A12", (FastVector) null), 11);
			model.insertAttributeAt(new Attribute("A13", (FastVector) null), 12);
			model.insertAttributeAt(new Attribute("A14", (FastVector) null), 13);
			model.insertAttributeAt(new Attribute("A15", (FastVector) null), 14);
			model.insertAttributeAt(new Attribute("A16", (FastVector) null), 15);
			model.insertAttributeAt(new Attribute("A17", (FastVector) null), 16);
			model.insertAttributeAt(new Attribute("A18", (FastVector) null), 17);
			
}