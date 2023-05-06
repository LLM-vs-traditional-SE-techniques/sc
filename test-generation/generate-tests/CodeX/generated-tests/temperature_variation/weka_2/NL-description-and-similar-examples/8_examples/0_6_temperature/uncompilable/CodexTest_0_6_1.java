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


public class CodexTest_0_6_1 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(this.m_Instances, 0, 0);
    model.deleteAttributeType(Attribute.STRING);
    model.deleteAttributeType(Attribute.RELATIONAL);
    model.deleteAttributeAt(1);
    AlgVector a = new AlgVector(model);
    assertNotNull(a.getAsInstance(model, new Random(1)));
  }
}