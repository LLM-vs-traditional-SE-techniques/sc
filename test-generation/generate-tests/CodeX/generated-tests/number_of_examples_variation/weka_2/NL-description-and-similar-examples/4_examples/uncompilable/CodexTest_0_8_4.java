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


public class CodexTest_0_8_4 { 
  @Test
  public void testNotEqualWhenClassValueNotEqual() {
    //given
    Instance a = new Instance(2);
    Instance m = new Instance(2);
    m.setDataset(new Instances("test", new FastVector(2), 1));
    m.setClassValue(0);
    a.setDataset(m.dataset());
    a.setClassValue(1);
}