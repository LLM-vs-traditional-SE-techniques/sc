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


public class CodexTest_0_5_20 { 
  @Test
    public void testRemoveAtIndex() {
        ArrayList<String> list = new ArrayList<String>();
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
        assertEquals("a", list.remove(0));
        assertEquals("b", list.remove(0));
        assertEquals("c", list.remove(0));
        assertEquals("d", list.remove(0));
        assertEquals("e", list.remove(0));
        assertEquals("f", list.remove(0));
        assertEquals("g", list.remove(0));
        assertEquals("h", list.remove(0));
        assertEquals("i", list.remove(0));
        assertEquals("j", list.remove(0));
        assertEquals("k", list.remove(0));
        assertEquals(0, list.size());
    }
}