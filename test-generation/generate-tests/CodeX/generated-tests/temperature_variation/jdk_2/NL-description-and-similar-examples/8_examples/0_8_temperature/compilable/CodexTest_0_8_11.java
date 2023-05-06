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


public class CodexTest_0_8_11 { 
  @Test
        public void testContains() {
        List<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals(true, list.contains("foo"));
        assertEquals(true, list.contains("bar"));
        assertEquals(true, list.contains("baz"));
        assertEquals(true, list.contains(new String("foo")));
        assertEquals(true, list.contains(new String("bar")));
        assertEquals(true, list.contains(new String("baz")));
        assertEquals(false, list.contains(""));
        assertEquals(false, list.contains("foobar"));
        assertEquals(false, list.contains("foobaz"));
        assertEquals(false, list.contains("barfoo"));
        assertEquals(false, list.contains("barbaz"));
        assertEquals(false, list.contains("bazfoo"));
        assertEquals(false, list.contains("bazbar"));
    }
}