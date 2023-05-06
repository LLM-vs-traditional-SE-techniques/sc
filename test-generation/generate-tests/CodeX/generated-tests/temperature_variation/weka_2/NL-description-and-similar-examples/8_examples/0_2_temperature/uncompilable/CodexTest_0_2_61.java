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


public class CodexTest_0_2_61 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("a"), 0);
        model.insertAttributeAt(new Attribute("b"), 1);
        model.insertAttributeAt(new Attribute("c"), 2);
        model.insertAttributeAt(new Attribute("d"), 3);
        model.insertAttributeAt(new Attribute("e"), 4);
        model.insertAttributeAt(new Attribute("f"), 5);
        model.insertAttributeAt(new Attribute("g"), 6);
        model.insertAttributeAt(new Attribute("h"), 7);
        model.insertAttributeAt(new Attribute("i"), 8);
        model.insertAttributeAt(new Attribute("j"), 9);
        model.insertAttributeAt(new Attribute("k"), 10);
        model.insertAttributeAt(new Attribute("l"), 11);
        model.insertAttributeAt(new Attribute("m"), 12);
        model.insertAttributeAt(new Attribute("n"), 13);
        model.insertAttributeAt(new Attribute("o"), 14);
        model.insertAttributeAt(new Attribute("p"), 15);
        model.insertAttributeAt(new Attribute("q"), 16);
        model.insertAttributeAt(new Attribute("r"), 17);
        model.insertAttributeAt(new Attribute("s"), 18);
        model.insertAttributeAt(new Attribute("t"), 19);
        model.insertAttributeAt(new Attribute("u"), 20);
        model.insertAttributeAt(new Attribute("v"), 21);
        model.insertAttributeAt(new Attribute("w"), 22);
        model.insertAttributeAt(new Attribute("x"), 23);
        model.insertAttributeAt(new Attribute("y"), 24);
        model.insertAttributeAt(new Attribute("z"), 25);
        model.insertAttributeAt(new Attribute("aa"), 26);
        model.insertAttributeAt(new Attribute("ab"), 27
}