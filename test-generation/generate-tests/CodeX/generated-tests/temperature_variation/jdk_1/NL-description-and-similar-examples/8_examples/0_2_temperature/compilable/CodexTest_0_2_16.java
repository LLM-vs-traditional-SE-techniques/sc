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


public class CodexTest_0_2_16 { 
  @Test
    public void testRemove() {
        List<String> list = new ArrayList<String>();
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
        list.remove(0);
        assertEquals("bar", list.get(0));
        list.remove(list.size() - 1);
        assertEquals("thud", list.get(list.size() - 1));
        list.remove(3);
        assertEquals("quux", list.get(3));
    }
}