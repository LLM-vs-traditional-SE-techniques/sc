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


public class CodexTest_0_6_1 { 
  @Test
    public void testRemove_int() {
        Integer[] data = {2, 1, 3, 4, 7, 9, 20, 0, -1};
        List<Integer> list = createList(data);
        for (int i = 0; i < data.length; i++) {
            assertEquals(data[i], list.remove(0));
        }
        assertTrue(list.isEmpty());
    }
}