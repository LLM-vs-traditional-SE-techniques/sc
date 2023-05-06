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


public class CodexTest_0_6_12 { 
  @Test
    public void testRemove() {
        final DoubleArrayList list = new DoubleArrayList();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        list.add(6.0);
        list.add(7.0);
        list.add(8.0);
        list.add(9.0);
        list.remove(4);
        assertEquals(new DoubleArrayList(new double[] {1.0, 2.0, 3.0, 4.0, 6.0, 7.0, 8.0, 9.0}), list);
        list.remove(list.size() - 1);
        assertEquals(new DoubleArrayList(new double[] {1.0, 2.0, 3.0, 4.0, 6.0, 7.0, 8.0}), list);
        list.remove(0);
        assertEquals(new DoubleArrayList(new double[] {2.0, 3.0, 4.0, 6.0, 7.0, 8.0}), list);
    }
}