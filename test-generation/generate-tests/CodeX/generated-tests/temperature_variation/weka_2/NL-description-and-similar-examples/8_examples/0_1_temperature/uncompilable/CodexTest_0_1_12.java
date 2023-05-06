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


public class CodexTest_0_1_12 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("att1"), 0);
			model.insertAttributeAt(new Attribute("att2"), 1);
			model.insertAttributeAt(new Attribute("att3"), 2);
			model.insertAttributeAt(new Attribute("att4", (FastVector) null), 3);
			model.insertAttributeAt(new Attribute("att5", (FastVector) null), 4);
			model.insertAttributeAt(new Attribute("att6", (FastVector) null), 5);
			model.insertAttributeAt(new Attribute("att7", (FastVector) null), 6);
			model.insertAttributeAt(new Attribute("att8", (FastVector) null), 7);
			model.insertAttributeAt(new Attribute("att9", (FastVector) null), 8);
			model.insertAttributeAt(new Attribute("att10", (FastVector) null), 9);
			model.insertAttributeAt(new Attribute("att11", (FastVector) null), 10);
			model.insertAttributeAt(new Attribute("att12", (FastVector) null), 11);
			model.insertAttributeAt(new Attribute("att13", (FastVector) null), 12);
			model.insertAttributeAt(new Attribute("att14", (FastVector) null), 13);
			model.insertAttributeAt(new Attribute("att15", (FastVector) null), 14);
			model.insertAttributeAt(new Attribute("att16", (FastVector) null), 15);
			model.insertAttributeAt(new Attribute("att17", (FastVector) null), 16);
			model.insertAttributeAt(new Attribute("att18", (FastVector) null), 17);
			
}