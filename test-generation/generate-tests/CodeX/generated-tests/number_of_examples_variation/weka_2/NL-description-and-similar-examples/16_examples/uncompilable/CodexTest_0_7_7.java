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


public class CodexTest_0_7_7 { 
    @Test
    public void testGetAsInstance() throws Exception {
        int numAtt = 4;
        Instances model = new Instances(numAtt);
        model.setClassIndex(numAtt - 1);
        model.add(new Attribute("numeric1"));
        model.add(new Attribute("nominal1", Arrays.asList("val1", "val2")));
        model.add(new Attribute("nominal2", Arrays.asList("val1", "val2", "val3")));
        model.add(new Attribute("class", Arrays.asList("val1", "val2")));
}