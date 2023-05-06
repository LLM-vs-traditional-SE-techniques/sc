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


public class CodexTest_0_8_9 { 
    @Test(expected = Exception.class) public void testGetAsInstance() throws Exception {
    Random random = new Random(10);
    Instances data = new Instances(new BufferedReader(new FileReader(this.datasetPath)));
    data.setClassIndex(data.numAttributes() - 1);
}