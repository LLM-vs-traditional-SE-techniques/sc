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
    public void testRemoveObject() {
        // add some elements
        for (int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }
        // remove a few elements
        list.remove(elements[0]);
        list.remove(elements[2]);
        list.remove(elements[5]);
        // check correctness
        assertEquals(elements.length - 3, list.size());
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i == 0 || i == 2 || i == 5) {
                continue;
            }
            assertEquals(elements[i], list.get(index));
            index++;
        }
    }
}