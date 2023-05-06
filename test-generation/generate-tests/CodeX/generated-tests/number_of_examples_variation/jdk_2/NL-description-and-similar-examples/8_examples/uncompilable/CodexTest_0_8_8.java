import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
    public void testContainsShouldReturnFalseWhenStringGiven() {
        // given
        List<Boolean> list = Arrays.asList(true, false, false);
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        boolean result = underTest.contains(list, BAD);
        // then
        assertFalse(result);
    }
}