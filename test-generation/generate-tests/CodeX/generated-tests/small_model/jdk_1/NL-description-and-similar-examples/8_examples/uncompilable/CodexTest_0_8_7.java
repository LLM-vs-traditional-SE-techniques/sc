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


public class CodexTest_0_8_7 { 
    // @Test
    public void testRemoveAt() {
        final Object[] oldArray = new Object[] {"foo", "bar", "baz", "yada", "yada", "yada", "yada", "yada"};
        final int nOldArray = oldArray.length;
        final int nNewArray = nOldArray - 1;
        final HashSet<Object> oldSet = new HashSet<Object>(oldArray.length);
        for (Object o : oldArray)
            oldSet.add(o);
        assertEquals("set size", oldSet.size(), nOldArray);
        Set<Object> newSet = new HashSet<Object>(oldSet);
        newSet.remove(oldArray[2]);
        assertEquals("set size", newSet.size(), nNewArray);
        // create an array out of the old array:
        final Object[] newArray = (Object[]) Arrays.copyOf(oldArray, nNewArray);
        // remove the element at position 2:
        oldArray[2] = null;
        assertArrayEquals("remove(2)", newArray, remove(2));
        // remove the element at position 1:
        oldArray[1] = null;
        assertArrayEquals("remove(1)", newArray, remove(1));
        // remove the element at position 0:
        oldArray[0] = null;
        assertArrayEquals("remove(0)", newArray, remove(0));
        // after the last removal, the array should have same size as before:
        assertEquals("after last removal", nNewArray, remove(0).length);
        assertEquals("after last removal", nNewArray, remove(1).length);
        assertEquals("after last removal", nNewArray, remove(2).length);
    }
}