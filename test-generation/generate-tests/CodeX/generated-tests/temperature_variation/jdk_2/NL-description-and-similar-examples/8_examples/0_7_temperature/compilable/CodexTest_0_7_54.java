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


public class CodexTest_0_7_54 { 
    @Test
    public void testContainsObject() {
        // given
        List<Integer> underTest = new ArrayList<Integer>();
        underTest.add(3);
        underTest.add(1);
        underTest.add(4);
        underTest.add(8);
        underTest.add(2);
        // when
        boolean result1 = underTest.contains(1);
        boolean result2 = underTest.contains(2);
        boolean result3 = underTest.contains(3);
        boolean result4 = underTest.contains(4);
        boolean result5 = underTest.contains(5);
        boolean result6 = underTest.contains(8);
        // then
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertFalse(result5);
        assertTrue(result6);
    }
}