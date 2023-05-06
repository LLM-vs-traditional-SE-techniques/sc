import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_74 { 
        @Test
        public void testFailBinary() {
			try {
				BooleanType type = new BooleanType();
				type.fromString("2");
				fail("It should not get here!");
			}catch (Exception e){
				if (!(e instanceof NumberFormatException)){
					fail("It should not get here!");
				}
			}
		}
}