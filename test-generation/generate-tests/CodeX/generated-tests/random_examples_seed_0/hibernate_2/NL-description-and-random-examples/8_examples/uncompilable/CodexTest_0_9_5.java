import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
    public void testInObjects() {
        Boolean truth = Boolean.TRUE;
        Boolean falsity = Boolean.FALSE;
        Boolean[] objects = { truth, falsity };
        List list = Arrays.asList(objects);
        assertTrue(list.contains(truth));
        assertTrue(list.contains(falsity));
        
        assertTrue(list.indexOf(truth) != -1);
        assertTrue(list.indexOf(falsity) != -1);
    }
}