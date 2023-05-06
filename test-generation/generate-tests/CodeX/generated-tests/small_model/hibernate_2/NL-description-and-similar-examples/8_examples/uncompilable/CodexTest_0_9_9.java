import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
    public void testStringConstructor() {
        String[] someStringsToTest = new String[]{ "foo",
            "bar", "f", "false", "0" };
        for (String elem : someStringsToTest){
            UtilBoolean b = new UtilBoolean( elem );
            assertFalse( b.isFalse() );
            assertFalse( b.isTrue() );
            if( Integer.parseInt( elem ) != 0 ){
                assertTrue( b.isTrue() );
            } else{
                assertFalse( b.isTrue() );
            }
        }
    }
}