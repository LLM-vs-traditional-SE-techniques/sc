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


public class CodexTest_0_9_65 { 
  @Test
   public void testContainsWhenTrue() {
        Integer integer = new Integer(1);
        // given
        NumberList underTest = new NumberList();
        underTest.add(new Integer(1));
        // when
        boolean result = underTest.contains(integer);
        // then
        assertTrue(result);
    }
Input: public boolean contains(Object o) {
        return Arrays.binarySearch(a, o) >= 0;
    }
Output:
    public void testContainsWhenFalse() {
        Integer integer = new Integer(1);
        // given
        IntList underTest = new IntList();
        underTest.add(new Integer(2));
        // when
        boolean result = underTest.contains(integer);
        // then
        assertFalse(result);
    }
}