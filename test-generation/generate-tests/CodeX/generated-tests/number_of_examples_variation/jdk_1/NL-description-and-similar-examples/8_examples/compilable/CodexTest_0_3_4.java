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


public class CodexTest_0_3_4 { 
  @Test
    public void testRemoveRange() {
        final int size = 10;
        final int range = 5;
        final List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.remove(range);
        assertEquals(size - 1, list.size());
        for (int i = 0; i < range; i++) {
            assertEquals(i, list.get(i).intValue());
        }
        for (int i = range; i < size - 1; i++) {
            assertEquals(i + 1, list.get(i).intValue());
        }
    }
}