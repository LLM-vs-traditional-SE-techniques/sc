import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_6 { 
  @Test
    public void testBooleanFromString() {
        try {
            Boolean.fromString("true");
            Boolean.fromString("false");
            Boolean.fromString("TRUE");
            Boolean.fromString("FALSE");
}