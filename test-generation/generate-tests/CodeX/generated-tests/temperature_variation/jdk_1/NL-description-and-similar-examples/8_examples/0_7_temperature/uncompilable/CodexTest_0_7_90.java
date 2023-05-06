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


public class CodexTest_0_7_90 { 
  @Test
    public void testRemoveObject() {
        ArrayList<Object> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add("six");
        l.add("seven");
        l.add("eight");
        l.add("nine");
        l.add("ten");
        l.add("eleven");
        try {
            l.remove(null);
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
        try {
            l.remove(Integer.valueOf(10000));
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
        try {
            l.remove(Integer.valueOf(-1));
            shouldThrow();
        } catch (IndexOutOfBoundsException success) {}
        assertEquals(l.remove(Integer.valueOf(0)), "one");
        assertEquals(l.remove(Integer.valueOf(1)), "three");
        assertEquals(l.remove(Integer.valueOf(2)), "four");
        assertEquals(l.remove(Integer.valueOf(2)), "six");
        assertEquals(l.remove(Integer.valueOf(2)), "seven");
        assertEquals(l.remove(Integer.valueOf(2)), "nine");
        assertEquals(l.remove(Integer.valueOf(2)), "ten");
        assertEquals(l.remove(Integer.valueOf(1)), "eight");
        assertEquals(l.remove(Integer.valueOf(0)), "two");
        assertEquals(l.remove(Integer.valueOf(0)), "five");
        assertEquals(l.remove(Integer.valueOf(0)), "eleven");
    }
}