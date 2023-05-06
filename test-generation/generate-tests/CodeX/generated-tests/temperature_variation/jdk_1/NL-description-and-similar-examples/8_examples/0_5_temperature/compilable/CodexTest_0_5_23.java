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


public class CodexTest_0_5_23 { 
  @Test
    public void testRemoveObject() {
        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        al.add("six");
        al.add("seven");
        al.add("eight");
        al.add("nine");
        al.add("ten");
        al.remove("five");
        assertEquals(9, al.size());
        assertEquals("six", al.get(4));
        assertEquals("ten", al.get(8));
        al.remove("three");
        assertEquals(8, al.size());
        assertEquals("four", al.get(2));
        al.remove("nine");
        assertEquals(7, al.size());
        assertEquals("ten", al.get(6));
        al.remove("one");
        assertEquals(6, al.size());
        assertEquals("two", al.get(0));
        al.remove("ten");
        assertEquals(5, al.size());
        assertEquals("eight", al.get(4));
    }
}