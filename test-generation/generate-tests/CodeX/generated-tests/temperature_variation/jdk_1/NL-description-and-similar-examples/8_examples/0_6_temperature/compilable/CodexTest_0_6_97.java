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


public class CodexTest_0_6_97 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(list.remove(0), Integer.valueOf(1));
        assertEquals(list.remove(3), Integer.valueOf(5));
        assertEquals(list.remove(1), Integer.valueOf(3));
        assertEquals(list.size(), 2);
        assertEquals(list.remove(1), Integer.valueOf(4));
        assertEquals(list.remove(0), Integer.valueOf(2));
        assertEquals(list.size(), 0);
    }
}