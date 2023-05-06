import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_15 { 
  @Test
    public void testToShortShouldReturnShortForTrue() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(Boolean.TRUE);
        // then
        assertEquals(Short.valueOf((short) 1), result);
    }
Input:
	public String toString(Boolean value) {
		return javaTypeDescriptor.toString( (short) toInt( value ) );
	}
Output:
    public void testToStringShouldReturnEmptyStringForFalse() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        String result = underTest.toString(Boolean.FALSE);
        // then
        assertEquals("0", result);
    }
}