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


public class CodexTest_0_7_40 { 
  @Test
    public void testRemove_Object() {
        SimpleList<String> list = new SimpleList<>(new String[] {
                "a", "b", "c" });
        assertEquals("b", list.remove("b"));
        assertEquals(2, list.size());
        assertEquals("c", list.get(0));
        assertEquals("a", list.get(1));
        assertEquals("a", list.remove("a"));
        assertEquals("c", list.remove("c"));
        assertNull(list.remove("d"));
        assertEquals(0, list.size());
        try {
            list.remove("e");
            fail("Expecting IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }
}