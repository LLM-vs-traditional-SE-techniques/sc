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


public class CodexTest_0_5_66 { 
  @Test
    public void testRemove() {
        String[] data = new String[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.toString(i);
        }
        List<String> list = new ArrayList<>(Arrays.asList(data));
        assertEquals("0", list.remove(0));
        assertEquals("1", list.remove(0));
        assertEquals("2", list.remove(0));
        assertEquals(7, list.size());
        assertEquals("3", list.remove(0));
        assertEquals(6, list.size());
        assertEquals("4", list.remove(0));
        assertEquals(5, list.size());
        assertEquals("5", list.remove(0));
        assertEquals(4, list.size());
        assertEquals("6", list.remove(0));
        assertEquals(3, list.size());
        assertEquals("7", list.remove(0));
        assertEquals(2, list.size());
        assertEquals("8", list.remove(0));
        assertEquals(1, list.size());
        assertEquals("9", list.remove(0));
        assertEquals(0, list.size());
    }
}