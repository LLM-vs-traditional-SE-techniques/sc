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


public class CodexTest_0_3_15 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.add("qux");
        assertEquals("bar", list.remove(1));
        assertEquals(3, list.size());
        assertEquals("foo", list.get(0));
        assertEquals("baz", list.get(1));
        assertEquals("qux", list.get(2));
    }
}