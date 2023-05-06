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


public class CodexTest_0_7_25 { 
  @Test
  def inst = model.enumerateInstances.get(0)
  val d = new DenseInstance(inst)
  val d2 = d.getAsInstance(model)
  assertTrue(inst.equals(d2))
  assertTrue(d2.equals(d))
}