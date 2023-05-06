import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
    public static <X> Boolean wrap(X value, WrapperOptions options) {
		if ( value == null ) {
			return null;
		}
		if ( Boolean.class.isInstance( value ) ) {
			return (Boolean) value;
		}
		if ( Number.class.isInstance( value ) ) {
			final int intValue = ( (Number) value ).intValue();
			return intValue == 0 ? FALSE : TRUE;
		}
		if ( Character.class.isInstance( value ) ) {
			return isTrue( (Character) value ) ? TRUE : FALSE;
		}
		if ( String.class.isInstance( value ) ) {
			return isTrue((String) value) ? TRUE : FALSE;
		}
		throw unknownWrap( value.getClass() );
	}
Output: public void testWrapShouldReturnTrueWhenYStringGiven() {
			// given
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			Boolean result = underTest.wrap("Y", null);
			// then
			assertTrue(result);
		}
}