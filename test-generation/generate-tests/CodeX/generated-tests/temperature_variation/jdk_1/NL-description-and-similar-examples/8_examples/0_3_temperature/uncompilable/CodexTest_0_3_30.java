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


public class CodexTest_0_3_30 { 
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
        assertEquals(Arrays.asList("foo", "baz", "qux", "quux", "corge", "grault", "garply", "waldo", "fred", "plugh", "xyzzy", "thud"), list);
        assertEquals("foo", list.remove(0));
        assertEquals(Arrays.asList("baz", "qux", "quux", "corge", "grault", "garply", "waldo", "fred", "plugh", "xyzzy", "thud"), list);
        assertEquals("thud", list.remove(list.size() - 1));
        assertEquals(Arrays.asList("baz", "qux", "quux", "corge", "grault", "garply", "waldo", "fred", "plugh", "xyzzy"), list);
        assertEquals("quux", list.remove(3));
        assertEquals(Arrays.asList("baz", "qux", "corge", "grault", "garply", "waldo", "fred", "plugh", "xyzzy"), list);
        assertEquals("xyzzy", list.remove(list.size() - 1));
        assertEquals(Arrays.asList("baz", "qux", "corge", "grault", "garply", "waldo", "fred", "plugh"), list);
        assertEquals("corge", list.remove(2));
        assertEquals(Arrays
}