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


public class CodexTest_0_6_84 { 
  @Test
  public void testRemoveInSubList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        List<String> subList = list.subList(2, 6);
        assertEquals(4, subList.size());
        assertEquals("c", subList.get(0));
        assertEquals("d", subList.get(1));
        assertEquals("e", subList.get(2));
        assertEquals("f", subList.get(3));
        assertEquals("c", subList.remove(0));
        assertEquals(3, subList.size());
        assertEquals("d", subList.get(0));
        assertEquals("e", subList.get(1));
        assertEquals("f", subList.get(2));
        assertEquals("d", list.get(2));
        assertEquals("e", list.get(3));
        assertEquals("f", list.get(4));
        assertEquals("g", list.get(5));
    }
}