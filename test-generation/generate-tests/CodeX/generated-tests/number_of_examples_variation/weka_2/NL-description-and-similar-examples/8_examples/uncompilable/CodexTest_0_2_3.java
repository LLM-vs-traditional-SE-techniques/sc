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


public class CodexTest_0_2_3 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances inst = new Instances(new FastVector(), new FastVector());
			inst.add(new Attribute("a"));
			inst.add(new Attribute("b"));
			inst.add(new Attribute("c"));
			inst.add(new Attribute("d"));
			inst.add(new Attribute("e"));
			inst.add(new Attribute("f"));
			inst.add(new Attribute("g"));
			inst.add(new Attribute("h"));
			inst.add(new Attribute("i"));
			inst.add(new Attribute("j"));
			inst.add(new Attribute("k"));
			inst.add(new Attribute("l"));
			inst.add(new Attribute("m"));
			inst.add(new Attribute("n"));
			inst.add(new Attribute("o"));
			inst.add(new Attribute("p"));
			inst.add(new Attribute("q"));
			inst.add(new Attribute("r"));
			inst.add(new Attribute("s"));
			inst.add(new Attribute("t"));
			inst.add(new Attribute("u"));
			inst.add(new Attribute("v"));
			inst.add(new Attribute("w"));
			inst.add(new Attribute("x"));
			inst.add(new Attribute("y"));
			inst.add(new Attribute("z"));
			inst.add(new Attribute("aa"));
			inst.add(new Attribute("bb"));
			inst.add(new Attribute("cc")
}