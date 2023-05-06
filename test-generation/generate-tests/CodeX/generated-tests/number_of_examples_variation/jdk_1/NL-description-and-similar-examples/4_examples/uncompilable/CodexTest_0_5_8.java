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


public class CodexTest_0_5_8 { 
  @Test
    public void testRemove() {
        final Object[] es = {null, "a", "b", "c", "d", "e"};
        final ArrayList<String> list = new ArrayList<>(Arrays.asList(es));
        assertEquals("a", list.remove(1));
        assertEquals(Arrays.asList(es).subList(1, es.length), list);
        assertEquals("e", list.remove(list.size() - 1));
        assertEquals(Arrays.asList(es).subList(1, es.length - 1), list);
        assertEquals("c", list.remove(2));
        assertEquals(Arrays.asList(es).subList(1, 2).concat(Arrays.asList(es).subList(3, es.length - 1)), list);
    }
}