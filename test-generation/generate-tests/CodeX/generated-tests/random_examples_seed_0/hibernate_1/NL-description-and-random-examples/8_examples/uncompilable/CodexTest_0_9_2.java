import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
   public static void testIand()
	{
		BitSet b1 = new BitSet();
		BitSet b2 = new BitSet();
		b1.Set(0, true); 
		b1.Set(1, true); 
		b1.Set(2, true); 
		b2.Set(1, true); 
		b2.Set(2, true); 
		b2.Set(3, true); 
}