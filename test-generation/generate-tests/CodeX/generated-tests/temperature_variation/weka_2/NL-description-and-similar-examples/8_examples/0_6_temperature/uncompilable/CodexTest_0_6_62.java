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


public class CodexTest_0_6_62 { 
  @Test
  public void testIsNumericString() {
    assertFalse(new Attribute("hallo").isNumeric());
    assertFalse(new Attribute("hallo", (ArrayList) null).isNumeric());
    assertFalse(new Attribute("hallo", (FastVector) null).isNumeric());
    assertFalse(Attribute.isNumeric("hallo"));
    assertFalse(Attribute.isNumeric("hallo", (ArrayList) null));
    assertFalse(Attribute.isNumeric("hallo", (FastVector) null));
  }
}