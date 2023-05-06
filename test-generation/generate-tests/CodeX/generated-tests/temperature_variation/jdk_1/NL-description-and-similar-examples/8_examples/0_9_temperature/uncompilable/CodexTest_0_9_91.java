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


public class CodexTest_0_9_91 { 
  @Test
    public void testRemoveWithElementData() throws Exception {
        final String[] strings = new String[func1().length];
        StringArrayList list = new StringArrayList(func1(), strings, 0);
        list.remove(5);
        assertEquals(strings.length, list.elementData.length);
        assertNull(strings[5]);
        assertEquals("2", list.remove(2));
        assertEquals("1", list.remove(1));
        assertEquals("0", list.remove(0));
        assertEquals("3", list.remove(0));
        assertEquals("4", list.remove(0));
        assertEquals("6", list.remove(0));
        assertEquals("7", list.remove(0));
        assertEquals("8", list.remove(0));
        assertEquals("9", list.remove(0));
        assertTrue(list.isEmpty());
    }
}