import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_16 { 
  @Test
    public void testToShortTrue() {
   		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
   		// when
   		Short result = underTest.toShort(true);
   		// then
   		assertEquals(new Short((short) 1), result);
   	}
Input: public static String getModuleName() {
      return Impl.getModuleName();
    }
Output: public void testGetModuleName() {
      assertEquals("com.google.gwt.core.Core.JUnit", GWT.getModuleName());
    }
Input: public static final Integer NULL = null;
Output: public void testGetModuleName() {
      assertEquals("com.google.gwt.core.Core.JUnit", GWT.getModuleName());
    }
Input: public static final Integer NULL = null;
Output: public void testGetModuleName() {
      assertNull(NULL);
    }
Input: public static final Integer NULL = null;
Output: public void testGetModuleName() {
      assertNotNull(NULL);
    }

}