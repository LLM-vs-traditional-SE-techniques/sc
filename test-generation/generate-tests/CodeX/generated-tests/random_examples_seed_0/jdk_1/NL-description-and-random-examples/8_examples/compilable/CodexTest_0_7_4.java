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


public class CodexTest_0_7_4 { 
  @Test
    public void testRemoveIndex() {
        String[] objects = {"a", "b", "c", "d", "e"};
        List<String> list = new ArrayList<String>(objects.length);
        Collections.addAll(list, objects);
        String[] array = new String[]{"a", "b", "c", "d", "e"};
        Object[] o = new Object[array.length];
        System.arraycopy(array, 0, o, 0, array.length);
        list.remove(1);
        array = new String[]{"a", "c", "d", "e"};
        o = new Object[array.length];
        System.arraycopy(array, 0, o, 0, array.length);
        ListIterator<String> it = list.listIterator();
        it.next();
        it.remove();
        array = new String[]{"a", "d", "e"};
        o = new Object[array.length];
        System.arraycopy(array, 0, o, 0, array.length);
        Assert.assertEquals(list.size(), array.length);
        Assert.assertArrayEquals(list.toArray(), o);
    }
}