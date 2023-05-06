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


public class CodexTest_0_7_5 { 
  @Test
    public void testRemove() {
        Object[] objects = new Object[]{1, 2, 3, 4, 5};
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(objects));
        assertEquals(5, list.size());
        assertEquals(1, list.remove(0));
        assertEquals(4, list.size());
        assertEquals(2, list.remove(0));
        assertEquals(3, list.remove(list.size() - 1));
        objects = new Object[1000];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = i;
        }
        list = new ArrayList<Object>(Arrays.asList(objects));
        for (int i = list.size() - 1; i >= 0; i--) {
            assertEquals(i, list.remove(i));
        }
    }
}