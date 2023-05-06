import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
    public void testFromString() {
		assertTrue( new BooleanTypeDescriptor().fromString("true") );
		assertFalse( new BooleanTypeDescriptor().fromString("false") );
		try {
			new BooleanTypeDescriptor().fromString( "not a boolean" );
			fail( "Expected an exception" );
		}
		catch (Exception e) {
			// expected
		}
	}
}