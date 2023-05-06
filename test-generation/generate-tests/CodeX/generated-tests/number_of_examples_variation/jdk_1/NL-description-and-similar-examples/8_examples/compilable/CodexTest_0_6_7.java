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


public class CodexTest_0_6_7 { 
  @Test
    public void testRemove() {
        Vector<Integer> v = new Vector<Integer>();
        v.add(new Integer(0));
        v.add(new Integer(1));
        v.add(new Integer(2));
        v.add(new Integer(3));
        v.add(new Integer(4));
        v.add(new Integer(5));
        v.add(new Integer(6));
        v.add(new Integer(7));
        v.add(new Integer(8));
        v.add(new Integer(9));
        v.remove(new Integer(5));
        for (int i = 0; i < v.size(); i++) {
            if (i < 5) {
                assertTrue(v.get(i).equals(new Integer(i)));
            } else {
                assertTrue(v.get(i).equals(new Integer(i + 1)));
            }
        }
    }
}