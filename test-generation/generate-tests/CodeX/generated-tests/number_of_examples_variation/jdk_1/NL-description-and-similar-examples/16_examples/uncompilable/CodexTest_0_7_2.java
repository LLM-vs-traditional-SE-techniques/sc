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


public class CodexTest_0_7_2 { 
  @Test
    public void testRemoveAtIndex() {
        Object[] arr = new Object[5];
        arr[0] = "0";
        arr[1] = "1";
        arr[2] = "2";
        arr[3] = "3";
        arr[4] = "4";
        List<Object> list = Lists.newArrayList(arr);
        assertEquals("1", list.remove(1));
        assertEquals(4, list.size());
        assertEquals("0", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("4", list.get(3));
    }
}