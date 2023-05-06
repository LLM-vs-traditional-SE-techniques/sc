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


public class CodexTest_0_6_44 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        assertEquals("b", list.remove(1));
        assertEquals(Arrays.asList("a", "c", "d"), list);
        list.clear();
        assertEquals(Arrays.<String>asList(), list);
        list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        assertEquals("a", list.remove(0));
        assertEquals(Arrays.asList("b", "c", "d"), list);
        list.clear();
        assertEquals(Arrays.<String>asList(), list);
        list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        assertEquals("d", list.remove(3));
        assertEquals(Arrays.asList("a", "b", "c"), list);
        list.clear();
        assertEquals(Arrays.<String>asList(), list);
        list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        try {
            list.remove(-1);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
        try {
            list.remove(4);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
    }
}