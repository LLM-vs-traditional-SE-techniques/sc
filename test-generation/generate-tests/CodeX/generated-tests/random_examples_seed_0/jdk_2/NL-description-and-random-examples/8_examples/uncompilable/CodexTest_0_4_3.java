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


public class CodexTest_0_4_3 { 
  @Test
    public void testContains() {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntArrayList list = new IntArrayList(values);
        assertTrue(list.contains(0));
        assertTrue(list.contains(5));
        assertTrue(list.contains(9));
        assertFalse(list.contains(10));
        assertFalse(list.contains(-1));
    }
}