import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_4 { 
  @Test
    public void testToShortShouldReturnZeroWhenNullGiven() {
        assertEquals(0, toShort(null));
    }
    public void testToShortShouldReturnOneWhenTrueGiven() {
        assertEquals(1, toShort(true));
    }
    public void testToShortShouldReturnZeroWhenFalseGiven() {
        assertEquals(0, toShort(false));
    }
}