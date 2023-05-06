import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_8 { 
  @Test
    public void testBoolean() {
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBooleanObject(1)));
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBooleanObject(0)));
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBooleanObject(5)));
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBoolean(1)));
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBoolean(0)));
        System.out.println(BooleanUtils.toStringOnOff(BooleanUtils.toBoolean(5)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBooleanObject(1)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBooleanObject(0)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBooleanObject(5)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBoolean(1)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBoolean(0)));
        System.out.println(BooleanUtils.toStringTrueFalse(BooleanUtils.toBoolean(5)));
        System.out.println(BooleanUtils.toStringYesNo(BooleanUtils.toBooleanObject(1)));
        System.out.println(BooleanUtils.toStringYesNo(BooleanUtils.toBooleanObject(0)));
        System.out.println(BooleanUtils.toStringYesNo(BooleanUtils.toBooleanObject(5)));
        System.out.println(BooleanUtils.toStringYesNo(BooleanUtils.toBoolean(1)));
        System
}