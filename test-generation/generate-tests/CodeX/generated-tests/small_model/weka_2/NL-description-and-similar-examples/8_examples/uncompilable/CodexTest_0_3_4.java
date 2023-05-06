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


public class CodexTest_0_3_4 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValuesFromVector() {
    // given
    int numAttributes = 3;
    int numValues = 2;
    int[] values = {1, 0};
    AlgVector vector = new AlgVector(values);
    Instances model = new Instances("test", new Attribute[numAttributes], 0);
    model.insertAttributeAt(new Attribute("test1"), 0);
    model.insertAttributeAt(new Attribute("
}