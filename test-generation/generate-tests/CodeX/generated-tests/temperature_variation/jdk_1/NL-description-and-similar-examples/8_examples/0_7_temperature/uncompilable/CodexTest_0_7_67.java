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


public class CodexTest_0_7_67 { 
  @Test
    public void testRemoveElement() {
        CustomList customList = new CustomList<>();
        for (int i = 0; i < 10; i++) {
            customList.add(i);
        }
        assertEquals(customList.remove(0), 0);
        assertEquals(customList.remove(1), 2);
        assertEquals(customList.remove(2), 3);
        assertEquals(customList.remove(3), 4);
        assertEquals(customList.remove(4), 5);
        assertEquals(customList.remove(5), 6);
        assertEquals(customList.remove(6), 7);
        assertEquals(customList.remove(7), 8);
        assertEquals(customList.remove(8), 9);
    }
}