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


public class CodexTest_0_7_12 { 
  @Test
    public void testRemove_2() {
        int[] source = new int[] { 1, 2, 3, 4, 5 };
        int[] dest = new int[] { 1, 2, 3 };
        System.arraycopy(source, 0, dest, 0, 3);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, source);
        assertArrayEquals(new int[] { 1, 2, 3 }, dest);
        source = new int[] { 1, 2, 3, 4, 5 };
        dest = new int[] { 1, 2, 3 };
        System.arraycopy(source, 2, dest, 2, 3);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, source);
        assertArrayEquals(new int[] { 1, 2, 3, 3, 4 }, dest);
        source = new int[] { 1, 2, 3, 4, 5 };
        dest = new int[] { 1, 2, 3, 4, 5 };
        System.arraycopy(source, 0, dest, 0, 5);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, source);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, dest);
    }
}