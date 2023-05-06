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


public class CodexTest_0_6_2 { 
  @Test
    public void testGetAsInstance() {
        Random random = new Random();
        Instances model = new Instances();
        model.setClassIndex(0);
        model.add(new Attribute("a"));
        model.add(new Attribute("b"));
        model.add(new Attribute("c"));
        model.add(new Attribute("d"));
        model.add(new Attribute("e"));
        model.add(new Attribute("f"));
        model.add(new Attribute("g"));
        model.add(new Attribute("h"));
        model.add(new Attribute("i"));
        model.add(new Attribute("j"));
        model.add(new Attribute("k"));
        model.add(new Attribute("l"));
        model.add(new Attribute("m"));
        model.add(new Attribute("n"));
        model.add(new Attribute("o"));
        model.add(new Attribute("p"));
        model.add(new Attribute("q"));
        model.add(new Attribute("r"));
        model.add(new Attribute("s"));
        model.add(new Attribute("t"));
        model.add(new Attribute("u"));
        model.add(new Attribute("v"));
        model.add(new Attribute("w"));
        model.add(new Attribute("x"));
        model.add(new Attribute("y"));
        model.add(new Attribute("z"));
        Instance instance = new DenseInstance(model.numAttributes());
        instance.setDataset(model);
        for (int i = 0, j = 0; i < model.numAttributes(); i++) {
            if (model.attribute(i).isNumeric()) {
                if (j >= m_Elements.length) {
                    throw new Exception("Datatypes are not compatible.");
                }
                instance.setValue(i, m_Elements[j++]);
            }
            if (model.attribute(i
}