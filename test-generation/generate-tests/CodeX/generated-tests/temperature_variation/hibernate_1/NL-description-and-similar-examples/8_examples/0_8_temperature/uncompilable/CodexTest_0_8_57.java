import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_57 { 
  @Test
    public void testEqualsAndHashCode() {
	    Entity e1 = new Entity();
	    e1.setId(1);
	    e1.setName("Entity 1");
	    Entity e2 = new Entity();
	    e2.setId(1);
	    e2.setName("Entity 1");
	    assertTrue(e1.equals(e2));
	    assertTrue(e2.equals(e1));
	    assertEquals(e1.hashCode(), e2.hashCode());
	}
}