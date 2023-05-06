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


public class CodexTest_0_3_2 { 
  @Test
    public void testRemoveAtIndex() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        assertEquals(list.remove(2), Integer.valueOf(7));
        assertEquals(list.size(), 3);
        assertEquals(list.get(0), Integer.valueOf(3));
        assertEquals(list.get(1), Integer.valueOf(5));
        assertEquals(list.get(2), Integer.valueOf(9));
    }
}