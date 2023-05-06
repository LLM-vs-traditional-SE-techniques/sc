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


public class CodexTest_0_5_16 { 
  @Test
    public void testRemove() {
        Vector<String> v = new Vector<String>();
        v.add("one");
        v.add("two");
        v.add("three");
        v.add("four");
        v.add("five");
        v.add("six");
        v.add("seven");
        v.add("eight");
        v.add("nine");
        v.add("ten");
        v.add("eleven");
        v.add("twelve");
        v.add("thirteen");
        v.add("fourteen");
        v.add("fifteen");
        v.add("sixteen");
        v.add("seventeen");
        v.add("eighteen");
        v.add("nineteen");
        v.add("twenty");
        v.remove(0);
        v.remove(1);
        v.remove(2);
        v.remove(3);
        v.remove(4);
        v.remove(5);
        v.remove(6);
        v.remove(7);
        v.remove(8);
        v.remove(9);
        v.remove(10);
        v.remove(11);
        v.remove(12);
        v.remove(13);
        v.remove(14);
        v.remove(15);
        v.remove(16);
        v.remove(17);
        v.remove(18);
        assertEquals("two", v.get(0));
        assertEquals("three", v.get(1));
        assertEquals("four", v.get(2));
        assertEquals("five", v.get(3));
        assertEquals("six", v.get(4));
        assertEquals("seven", v.get(5));
        assertEquals("eight", v.get(6));
        assertEquals("nine", v.get(7));
        assertEquals("ten", v.get(8));
        assertEquals("eleven", v.get(9));
        assertEquals("twelve", v.get(10));
}