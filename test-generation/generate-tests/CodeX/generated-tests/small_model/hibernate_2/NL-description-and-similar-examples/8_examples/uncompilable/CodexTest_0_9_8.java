import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testContainsAsBoolean() {
     assertTrue( new AlgVector(1.0, 5.0).contains( "5", DoubleType.INSTANCE ) );
	}
}