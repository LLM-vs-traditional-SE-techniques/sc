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


public class CodexTest_0_9_44 { 
  @Test
    public void testRemoveWithElementType() {
            Object[] array = new Object[] { "foo", null, "bar" };
            @SuppressWarnings("unchecked")
            List<String> list = new ArrayList<>((java.util.Collection<String>) Arrays.asList(array));
            assertEquals("bar", list.remove(2));
            assertEquals(2, list.size());
            assertEquals("foo", list.get(0));
            assertNull(list.get(1));
            assertNull(array[2]);
            assertEquals("foo", list.remove(0));
            assertEquals(1, list.size());
            assertNull(list.get(0));
            assertNull(array[1]);
            assertNull(list.remove(0));
            assertEquals(0, list.size());
        }
}