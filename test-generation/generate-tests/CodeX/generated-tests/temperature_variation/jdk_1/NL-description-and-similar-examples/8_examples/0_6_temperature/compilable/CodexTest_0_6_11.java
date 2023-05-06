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


public class CodexTest_0_6_11 { 
  @Test
   public void testRemove() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);
        al.remove(2);
        assertEquals(1, (int) al.get(0));
        assertEquals(3, (int) al.get(1));
        assertEquals(7, (int) al.get(2));
        assertEquals(9, (int) al.get(3));
        assertEquals(4, al.size());
    }
}