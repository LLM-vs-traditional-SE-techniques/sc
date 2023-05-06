import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_9 { 
  @Test
    public void testToShort() {
		assertEquals( "toShort(true) failed", (short) 1,
					  BooleanUtils.toShort( Boolean.TRUE ) );
		assertEquals( "toShort(false) failed", (short) 0,
					  BooleanUtils.toShort( Boolean.FALSE ) );
		assertEquals( "toShort(null) failed", (short) 0,
					  BooleanUtils.toShort( (Boolean) null ) );
		assertEquals( "toShort(TRUE) failed", (short) 1,
					  BooleanUtils.toShort( "true" ) );
		assertEquals( "toShort(FALSE) failed", (short) 0,
					  BooleanUtils.toShort( "false" ) );
		assertEquals( "toShort(null) failed", (short) 0,
					  BooleanUtils.toShort( (String) null ) );
		try {
			BooleanUtils.toShort( "TRUE" );
			fail( "Expected IllegalArgumentException" );
		} catch ( IllegalArgumentException e ) {
			// expected result
		}
	}
}