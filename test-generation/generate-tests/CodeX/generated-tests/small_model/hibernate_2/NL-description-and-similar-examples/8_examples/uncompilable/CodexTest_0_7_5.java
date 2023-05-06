import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
    @Test
    public void testFromString() {
			assertTrue( BooleanTypeDescriptor.fromString("true").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("True").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("TRUE").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("1").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("yes").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("y").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("Y").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("YES").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("on").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("On").booleanValue() );
			assertTrue( BooleanTypeDescriptor.fromString("ON").booleanValue() );
}