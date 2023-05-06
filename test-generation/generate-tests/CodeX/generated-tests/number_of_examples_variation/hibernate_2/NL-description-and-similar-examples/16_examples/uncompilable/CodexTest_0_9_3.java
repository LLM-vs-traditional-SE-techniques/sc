import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
   @Test
   public void testFromString() {
      MyType myType = new MyType();
      assertTrue("true should be true", myType.fromString("true"));
      assertFalse("false should be false", myType.fromString("false"));
      assertTrue("TRUE should be true", myType.fromString("TRUE"));
      assertFalse("FALSE should be false", myType.fromString("FALSE"));
   }
}