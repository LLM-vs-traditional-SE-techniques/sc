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


public class CodexTest_0_6_2 { 
  @Test
        public void testRemove() {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        assertEquals((Integer) 2, l.remove(1));
        assertEquals((Integer) 3, l.remove(1));
        assertEquals((Integer) 4, l.remove(1));
        assertEquals((Integer) 1, l.remove(0));
        assertEquals((Integer) 5, l.remove(0));
        assertEquals(0, l.size());
    }
}