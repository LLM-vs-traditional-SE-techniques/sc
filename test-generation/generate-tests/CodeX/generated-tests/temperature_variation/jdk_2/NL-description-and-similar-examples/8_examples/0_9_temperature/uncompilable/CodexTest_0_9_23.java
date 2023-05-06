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


public class CodexTest_0_9_23 { 
  @Test
    public void testContainsIndexOf() {
        Counter counter = new Counter();
        CounterItem item = new CounterItem(counter, "A");
        CounterItem.values.add(item);
        assertTrue(CounterItem.contains(item));
        assertTrue(CounterItem.contains("A"));
        assertTrue(CounterItem.contains(Boolean.TRUE));
        assertFalse(CounterItem.contains(false));
        assertFalse(CounterItem.contains(null));
        assertEquals(0, CounterItem.values.indexOf(item));
        assertEquals(-1, CounterItem.values.indexOf(false));
        assertEquals(-1, CounterItem.values.indexOf(null));
    }
}