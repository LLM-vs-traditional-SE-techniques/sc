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
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        assertEquals(2, list.remove(1).intValue());
        assertEquals(Arrays.asList(1, 3, 4), list);
        list.remove(0);
        assertEquals(Arrays.asList(3, 4), list);
        list.remove(1);
        assertEquals(Arrays.asList(3), list);
        list.remove(0);
        assertEquals(Arrays.asList(), list);
    }
}