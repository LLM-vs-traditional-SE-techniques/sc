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


public class CodexTest_0_7_32 { 
  @Test
    public void testRemove_int() {
        Integer o1 = new Integer(1);
        Integer o2 = new Integer(2);
        Integer o3 = new Integer(3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals(o1, list.get(0));
        assertEquals(o2, list.get(1));
    }
}