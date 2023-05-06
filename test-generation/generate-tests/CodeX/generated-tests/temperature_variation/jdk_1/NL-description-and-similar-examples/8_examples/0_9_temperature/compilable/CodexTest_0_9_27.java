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


public class CodexTest_0_9_27 { 
  @Test
     public void testRemoveBefore() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 11; ++i) {
            list.addLast(i);
        }
        assertEquals(list.element(), new Integer(1));
        assertEquals(list.getFirst(), new Integer(1));
        for (int i = 1; i < 11; ++i) {
            list.remove(0);
            if (list.isEmpty()) {
                assertEquals(list.element(), null);
                assertEquals(list.getFirst(), null);
            } else {
                assertEquals(list.element(), list.getFirst());
            }
        }
    }
}