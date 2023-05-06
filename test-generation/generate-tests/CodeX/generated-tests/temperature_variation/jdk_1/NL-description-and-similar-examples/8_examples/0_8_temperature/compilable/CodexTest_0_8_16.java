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


public class CodexTest_0_8_16 { 
  @Test
    public void testRemoveIndex() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        list.remove(1);
        arr = list.toArray(new Integer[list.size()]);
        assertEquals(4, arr.length);
        assertEquals(Integer.valueOf(1), arr[0]);
        assertEquals(Integer.valueOf(3), arr[1]);
        assertEquals(Integer.valueOf(4), arr[2]);
        assertEquals(Integer.valueOf(5), arr[3]);
    }
}