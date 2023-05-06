import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
    public void testFromString() {
		assertEquals( new Boolean( true ), BooleanTypeDescriptor.INSTANCE.fromString( "true" ) );
		assertEquals( new Boolean( false ), BooleanTypeDescriptor.INSTANCE.fromString( "false" ) );
		assertEquals( new Boolean( true ), BooleanTypeDescriptor.INSTANCE.fromString( "TRUE" ) );
		assertEquals( new Boolean( false ), BooleanTypeDescriptor.INSTANCE.fromString( "FALSE" ) );
		assertEquals( new Boolean( true ), BooleanTypeDescriptor.INSTANCE.fromString( "tRuE" ) );
		assertEquals( new Boolean( false ), BooleanTypeDescriptor.INSTANCE.fromString( "fAlSe" ) );
	}
}