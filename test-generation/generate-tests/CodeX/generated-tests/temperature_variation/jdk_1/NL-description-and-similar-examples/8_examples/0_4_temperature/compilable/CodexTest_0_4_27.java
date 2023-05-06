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


public class CodexTest_0_4_27 { 
  @Test
    public void testRemove() {
        final int[] data = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final ArrayList<Integer> list = new ArrayList<Integer>(data.length);
        for (final int element : data) {
            list.add(element);
        }
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], list.remove(0).intValue());
        }
    }
}