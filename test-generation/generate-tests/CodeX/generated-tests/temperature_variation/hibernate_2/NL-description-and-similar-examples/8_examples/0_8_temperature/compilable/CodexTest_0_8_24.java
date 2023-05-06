import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_24 { 
  @Test
    public void testFromStringNullString() {
        try {
            new BooleanTypeDescriptor().fromString(null);
        } catch (final Exception e) {
            fail("Expected no exception, got " + e.getMessage());
        }
    }
}