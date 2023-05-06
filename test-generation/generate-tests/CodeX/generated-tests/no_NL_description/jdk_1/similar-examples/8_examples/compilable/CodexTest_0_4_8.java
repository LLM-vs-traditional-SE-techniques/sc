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


public class CodexTest_0_4_8 { 
  @Test
    public void testRemoveByIndex() {
        int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = new ArrayList<>(data.length);
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        Integer removed = list.remove(0);
        assertEquals(Integer.valueOf(1), removed);
        assertEquals(data.length - 1, list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(Integer.valueOf(data[i + 1]), list.get(i));
        }
    }
}