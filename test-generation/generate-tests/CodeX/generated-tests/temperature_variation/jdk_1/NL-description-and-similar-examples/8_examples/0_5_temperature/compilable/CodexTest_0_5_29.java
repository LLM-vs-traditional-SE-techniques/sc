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


public class CodexTest_0_5_29 { 
  @Test
   public void testRemove() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        assertEquals(10, (int) al.remove(0));
        assertEquals(20, (int) al.remove(0));
        assertEquals(30, (int) al.remove(0));
        assertEquals(40, (int) al.remove(0));
        assertEquals(50, (int) al.remove(0));
        assertTrue(al.isEmpty());
    }
}