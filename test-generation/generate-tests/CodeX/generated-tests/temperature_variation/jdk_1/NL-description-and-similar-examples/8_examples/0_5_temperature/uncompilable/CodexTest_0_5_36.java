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


public class CodexTest_0_5_36 { 
  @Test
    public void testRemove() {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        assertEquals("1", list.remove(0));
        assertEquals("3", list.remove(1));
        assertEquals("5", list.remove(2));
        assertEquals("7", list.remove(3));
        assertEquals("9", list.remove(4));
        assertEquals("11", list.remove(5));
        assertEquals("13", list.remove(6));
        assertEquals("2", list.get(0));
        assertEquals("4", list.get(1));
        assertEquals("6", list.get(2));
        assertEquals("8", list.get(3));
        assertEquals("10", list.get(4));
        assertEquals("12", list.get(5));
        assertEquals("14", list.get(6));
    }
}