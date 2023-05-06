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


public class CodexTest_0_7_63 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertTrue(list.remove(new Integer(1)));
        assertTrue(list.remove(new Integer(5)));
        assertTrue(list.remove(new Integer(3)));
        assertEquals(2, list.size());
        assertEquals(2, list.get(0).intValue());
        assertEquals(4, list.get(1).intValue());
    }
}