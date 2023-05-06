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


public class CodexTest_0_8_37 { 
  @Test
  public void test() throws Exception {
    Classifier classifier = new DummyClassifier();
    Instances model = new Instances(new BufferedReader(new FileReader("data/iris.arff")));
    model.setClassIndex(4);
    Instance test = classifier.getAsInstance(model, new Random());
    assertNotNull(test);
  }

}