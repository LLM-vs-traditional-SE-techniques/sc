import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
    public void testFromStringShouldReturnTrueWhenTrueStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("true");
        // then
        assertEquals(true, result.booleanValue());
    }
    public void testFromStringShouldReturnFalseWhenFalseStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertEquals(false, result.booleanValue());
    }
    public void testFromStringShouldReturnFalseWhenFalseStringGiven2() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("falSe");
        // then
        assertEquals(false, result.booleanValue());
    }
    public void testFromStringShouldReturnFalseWhenFalseStringGiven3() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertEquals(false, result.booleanValue());
    }
Input: public static   String createScriptTag(String src) {
    return "<script type=text/javascript language=javascript src= + src + ></script>";
  }
Output: public void testCreateScriptTag() {
		assertEquals("<script type=text/javascript language=javascript src=test/test.js></script>",
				ScriptInjector.fromUrl("test/test.js").toString());
	}
}