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


public class CodexTest_0_3_35 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(5, list.size());
        assertEquals(1, (int) list.remove(0));
        assertEquals(2, list.size());
        assertEquals(2, (int) list.remove(0));
        assertEquals(3, (int) list.remove(0));
        assertEquals(4, (int) list.remove(0));
        assertEquals(5, (int) list.remove(0));
        assertEquals(0, list.size());
    }
}