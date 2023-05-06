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


public class CodexTest_0_5_48 { 
  @Test
    public void testRemove() {
        final List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        assertEquals("a", list.remove(0));
        assertEquals("l", list.remove(list.size() - 1));
        assertEquals("k", list.remove(list.size() - 1));
        assertEquals("j", list.remove(list.size() - 1));
        assertEquals("i", list.remove(list.size() - 1));
        assertEquals("h", list.remove(list.size() - 1));
        assertEquals("g", list.remove(list.size() - 1));
        assertEquals("f", list.remove(list.size() - 1));
        assertEquals("e", list.remove(list.size() - 1));
        assertEquals("d", list.remove(list.size() - 1));
        assertEquals("c", list.remove(list.size() - 1));
        assertEquals("b", list.remove(list.size() - 1));
        assertEquals(0, list.size());
    }
}