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


public class CodexTest_0_8_94 { 
  @Test
    public void shouldCheckIfObjectsAreEqual() {
        // given
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        MyObjectList list = new MyObjectList();
        list.add(a);
        list.add(b);
        // when
        boolean contains = list.contains(a);
        boolean doesNotContain = list.contains(c);
        // then
        assertTrue(contains);
        assertFalse(doesNotContain);
    }
    public void shouldCheckIfNullIsContained() {
        // given
        Object a = null;
        MyObjectList list = new MyObjectList();
        list.add(a);
        // when
        boolean containsNull = list.contains(null);
        // then
        assertTrue(containsNull);
    }
}