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


public class CodexTest_0_7_28 { 
  @Test
    public void testRemoveIndexed() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.remove(4);
        assertEquals(Arrays.asList("0", "1", "2", "3", "5", "6", "7", "8"), list);
        assertEquals("0", list.get(0));
        assertEquals("1", list.get(1));
        assertEquals("2", list.get(2));
        assertEquals("3", list.get(3));
        assertEquals("5", list.get(4));
        assertEquals("6", list.get(5));
        assertEquals("7", list.get(6));
        assertEquals("8", list.get(7));
        assertEquals(8, list.size());
    }
}