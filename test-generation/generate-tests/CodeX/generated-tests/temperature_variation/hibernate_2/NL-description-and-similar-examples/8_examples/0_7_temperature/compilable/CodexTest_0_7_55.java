import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_55 { 
  @Test
  public void testFromString() {
		assertTrue( "true", BooleanTypeDescriptor.INSTANCE.fromString( "true" ) );
		assertFalse( "false", BooleanTypeDescriptor.INSTANCE.fromString( "false" ) );
	}
}