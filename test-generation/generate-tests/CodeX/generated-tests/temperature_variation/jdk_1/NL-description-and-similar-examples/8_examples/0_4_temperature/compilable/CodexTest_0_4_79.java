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


public class CodexTest_0_4_79 { 
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
        String removed = list.remove(0);
        assertEquals("foo", removed);
        assertEquals(12, list.size());
        assertEquals("bar", list.get(0));
        assertEquals("thud", list.get(10));
        assertEquals("xyzzy", list.get(11));
        removed = list.remove(list.size() - 1);
        assertEquals("thud", removed);
        assertEquals(11, list.size());
        assertEquals("bar", list.get(0));
        assertEquals("xyzzy", list.get(10));
    }
}