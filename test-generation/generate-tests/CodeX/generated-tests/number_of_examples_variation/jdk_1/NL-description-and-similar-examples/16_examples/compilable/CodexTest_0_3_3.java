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


public class CodexTest_0_3_3 { 
  @Test
    public void testRemove() {
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(list.remove(0), Integer.valueOf(0));
        assertEquals(list.remove(0), Integer.valueOf(1));
        assertEquals(list.remove(0), Integer.valueOf(2));
        assertEquals(list.remove(0), Integer.valueOf(3));
        assertEquals(list.remove(0), Integer.valueOf(4));
        assertEquals(list.remove(0), Integer.valueOf(5));
        assertEquals(list.remove(0), Integer.valueOf(6));
        assertEquals(list.remove(0), Integer.valueOf(7));
        assertEquals(list.remove(0), Integer.valueOf(8));
        assertEquals(list.remove(0), Integer.valueOf(9));
    }
}