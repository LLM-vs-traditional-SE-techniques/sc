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


public class CodexTest_0_9_34 { 
  @Test
    public void removeRange() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(2, 12);
        ListIterator<Integer> listIterator = subList.listIterator();
        while (listIterator.hasNext()) {
            Object value = listIterator.next();
            if (value.equals(5) || value.equals(6)) {
                listIterator.remove();
            }
        }
        assertEquals(20, list.size());
        assertEquals(10, subList.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
        assertEquals(Integer.valueOf(4), list.get(3));
        assertEquals(Integer.valueOf(7), list.get(4));
        assertEquals(Integer.valueOf(8), list.get(5));
        assertEquals(Integer.valueOf(9), list.get(6));
        assertEquals(Integer.valueOf(10), list.get(7));
        assertEquals(Integer.valueOf(11), list.get(8));
        assertEquals(Integer.valueOf(12), list.get(9));
        assertEquals(Integer.valueOf(13), list.get(10));
        assertEquals(Integer.valueOf(14), list.get(11));
        assertEquals(Integer.valueOf(15), list.get(12));
        assertEquals(Integer.valueOf(16), list.get(13));
        assertEquals(Integer.valueOf(17), list.get(14));
        assertEquals(Integer.valueOf(18), list.get(15));
        assertEquals(Integer.valueOf(19), list.get(16));
        assertEquals(Integer.valueOf(20), list.get
}