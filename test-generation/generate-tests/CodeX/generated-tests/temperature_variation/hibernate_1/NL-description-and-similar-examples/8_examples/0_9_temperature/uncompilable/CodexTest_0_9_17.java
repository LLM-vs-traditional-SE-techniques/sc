import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_17 { 
  @Test
  public void testGetLongWithStringValue() {
		FormattableColumn<LocalDateTime, StringFactory> column = new FormattableColumn<>(
				StringFactory.INSTANCE,
				LocalDateTime.now(),
				new TestClock()
		);
		column.setValue("12345");
		assertEquals(12345L, column.getLong());
		assertEquals(12345L, column.getLong(0));
	}

}