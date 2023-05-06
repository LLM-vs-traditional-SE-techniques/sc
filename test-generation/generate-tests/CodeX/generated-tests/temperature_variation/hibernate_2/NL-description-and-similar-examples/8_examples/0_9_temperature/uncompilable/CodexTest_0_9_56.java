import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_56 { 
  @Test
      public void testFromString() {
        assertTrue( Boolean.valueOf( "true" ) );
        assertFalse( Boolean.valueOf( "false" ) );
        try {
          Boolean.valueOf( "1" );
          fail();
        } catch( NumberFormatException e ) {
          //Expected
        }  
      }
      
Input: public Vector1DFormat getInstance(java.util.Locale locale) {
		return getInstance(GLOBAL_FORMAT, locale);
	}
Output: public void testGetInstance() {
        final Vector1DFormat vf = Vector1DFormat.getInstance();
        Assert.assertNotNull(vf);
        Assert.assertTrue(vf instanceof Vector1DFormat);
        Assert.assertEquals(Vector1DFormat.DEFAULT_SEPARATOR, vf.getSeparator());
    }
}