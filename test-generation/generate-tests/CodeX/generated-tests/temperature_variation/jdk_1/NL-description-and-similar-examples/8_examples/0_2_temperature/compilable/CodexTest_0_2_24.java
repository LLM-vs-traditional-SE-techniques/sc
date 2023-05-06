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


public class CodexTest_0_2_24 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(new Integer(3), list.remove(2));
        assertEquals(new Integer(5), list.remove(3));
        assertEquals(new Integer(2), list.remove(0));
        assertEquals(new Integer(4), list.remove(0));
        assertEquals(new Integer(1), list.remove(0));
        assertEquals(0, list.size());
    }
}