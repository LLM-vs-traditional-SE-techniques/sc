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


public class CodexTest_0_5_94 { 
  @Test
    public void testRemoveRange() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.remove(5);
        list.remove(4);
        list.remove(3);
        list.remove(2);
        list.remove(1);
        list.remove(0);
        assertEquals(4, list.size());
        assertEquals(6, list.get(0).intValue());
        assertEquals(7, list.get(1).intValue());
        assertEquals(8, list.get(2).intValue());
        assertEquals(9, list.get(3).intValue());
    }
}