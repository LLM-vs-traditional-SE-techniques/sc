import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_42 { 
  @Test
    public void testConvertsToShortOrNullWhenTrueGiven() {
        // given
        Boolean booleanValue = Boolean.TRUE;
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
}