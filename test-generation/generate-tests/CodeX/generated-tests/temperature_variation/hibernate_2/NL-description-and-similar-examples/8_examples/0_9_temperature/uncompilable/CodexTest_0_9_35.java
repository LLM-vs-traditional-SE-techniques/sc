import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_35 { 
    @Test
    public void fromString_validValue_shouldReturnTrue(){
        ObjectConverter<Boolean> underTest = new ObjectConverter<Boolean>(Boolean.class);
}