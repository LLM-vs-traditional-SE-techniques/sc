import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
    public void testFromStringShouldReturnFalseForFString() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("f");
        // then
        assertFalse(result);
    }
Input:  public boolean convertToBoolean(Object value) {
        if ( value == null ) {
            return false;
        }
        return ( (Boolean) value ).booleanValue();
    }
Output:
    public void testConvertToBooleanNull() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        boolean result = underTest.convertToBoolean(null);
        // then
        assertFalse(result);
    }
Input:  public boolean convertToBoolean(Object value) {
        if ( value == null ) {
            return false;
        }
        return ( (Boolean) value ).booleanValue();
    }
Output:
    public void testConvertToBooleanTrue() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        boolean result = underTest.convertToBoolean(Boolean.TRUE);
        // then
        assertTrue(result);
    }
Input:  public boolean convertToBoolean(Object value) {
        if ( value == null ) {
            return false;
        }
        return ( (Boolean) value ).booleanValue();
    }
Output:
    public void testConvertToBooleanFalse() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        boolean result = underTest.convertToBoolean(Boolean.FALSE);
        // then
        assertFalse(result);
    }
}