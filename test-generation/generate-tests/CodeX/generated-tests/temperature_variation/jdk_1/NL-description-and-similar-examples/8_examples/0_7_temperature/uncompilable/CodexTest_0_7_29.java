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


public class CodexTest_0_7_29 { 
  @Test
    public void testRemove() {
        for (int size = 0; size < 8; size++) {
            for (int index = 0; index < size; index++) {
                List<Integer> list = intArrayAsList(new int[size]);
                assertEquals(index, (int) list.remove(index));
                int[] array = new int[size - 1];
                for (int i = 0; i < index; i++) {
                    array[i] = i;
                }
                for (int i = index + 1; i < size; i++) {
                    array[i - 1] = i;
                }
                assertEqualContent(list, array);
            }
        }
    }
}