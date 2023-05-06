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


public class CodexTest_0_6_9 { 
  @Test
    public void testRemove() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("0");
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.remove(0);
        a.remove(2);
        a.remove(4);
        a.remove(6);
        a.remove(8);
        assertEquals(5, a.size());
        assertEquals("1", a.get(0));
        assertEquals("3", a.get(1));
        assertEquals("5", a.get(2));
        assertEquals("7", a.get(3));
        assertEquals("9", a.get(4));
    }
}