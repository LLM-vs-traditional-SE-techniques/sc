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


public class CodexTest_0_7_79 { 
  @Test
    public void testRemove() {
        int size = list.size();
        Object obj = list.get(0);
        Object obj2 = list.remove(0);
        assertSame(size - 1, list.size());
        assertSame(obj, obj2);
        assertEquals(0, list.indexOf(obj));
        assertEquals(-1, list.lastIndexOf(obj));
    }
    
Input: public void remove(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // clear to let GC do its work
    }
Output: public void testRemoveIndex() {
        list.remove(0);
        assertEquals(2, list.size());
        assertEquals(new Integer(2), list.get(0));
        try {
            list.remove(-1);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
            //expected
        }
        try {
            list.remove(5);
            fail("IndexOutOfBoundsException expected");
        } catch (IndexOutOfBoundsException e) {
            //expected
        }
    }
}