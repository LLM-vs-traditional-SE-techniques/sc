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


public class CodexTest_0_2_15 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.add("qux");
        list.add("quux");
        list.add("corge");
        list.add("grault");
        list.add("garply");
        list.add("waldo");
        list.add("fred");
        list.add("plugh");
        list.add("xyzzy");
        list.add("thud");
        assertEquals("bar", list.remove(1));
        assertEquals("baz", list.remove(1));
        assertEquals("qux", list.remove(1));
        assertEquals("quux", list.remove(1));
        assertEquals("corge", list.remove(1));
        assertEquals("grault", list.remove(1));
        assertEquals("garply", list.remove(1));
        assertEquals("waldo", list.remove(1));
        assertEquals("fred", list.remove(1));
        assertEquals("plugh", list.remove(1));
        assertEquals("xyzzy", list.remove(1));
        assertEquals("thud", list.remove(1));
        assertEquals(1, list.size());
        assertEquals("foo", list.get(0));
    }
}