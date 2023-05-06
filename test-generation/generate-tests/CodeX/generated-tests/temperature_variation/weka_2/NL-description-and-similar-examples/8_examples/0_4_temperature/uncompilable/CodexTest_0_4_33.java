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


public class CodexTest_0_4_33 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.add(new Attribute("att1"));
			model.add(new Attribute("att2"));
			model.add(new Attribute("att3"));
			model.add(new Attribute("att4", (FastVector) null));
			model.add(new Attribute("att5", (FastVector) null));
			model.add(new Attribute("att6", (FastVector) null));
			model.add(new Attribute("att7", (FastVector) null));
			model.add(new Attribute("att8", (FastVector) null));
			model.add(new Attribute("att9", (FastVector) null));
			model.add(new Attribute("att10", (FastVector) null));
			model.add(new Attribute("att11", (FastVector) null));
			model.add(new Attribute("att12", (FastVector) null));
			model.add(new Attribute("att13", (FastVector) null));
			model.add(new Attribute("att14", (FastVector) null));
			model.add(new Attribute("att15", (FastVector) null));
			model.add(new Attribute("att16", (FastVector) null));
			model.add(new Attribute("att17", (FastVector) null));
			model.add(new Attribute("att18", (FastVector) null));
			model.add(new Attribute("att19", (FastVector) null));
			model.add(new Attribute("att20", (FastVector) null));
			model.add(new Attribute("att21", (FastVector) null));
			model.add(new Att
}