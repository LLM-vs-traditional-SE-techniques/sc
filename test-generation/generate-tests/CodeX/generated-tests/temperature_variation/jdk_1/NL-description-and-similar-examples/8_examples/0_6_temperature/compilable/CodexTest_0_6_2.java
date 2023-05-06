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


public class CodexTest_0_6_2 { 
  @Test
    public void testRemoveByIndex() {
        Object[] array = new Object[] { "foo", "bar", "baz" };
        List<Object> list = new ArrayList<>(Arrays.asList(array));
        assertEquals("bar", list.remove(1));
        array = new Object[] { "foo", "baz" };
        assertEquals(Arrays.asList(array), list);
        assertEquals("baz", list.remove(1));
        array = new Object[] { "foo" };
        assertEquals(Arrays.asList(array), list);
        assertEquals("foo", list.remove(0));
        array = new Object[] { };
        assertEquals(Arrays.asList(array), list);
    }
}