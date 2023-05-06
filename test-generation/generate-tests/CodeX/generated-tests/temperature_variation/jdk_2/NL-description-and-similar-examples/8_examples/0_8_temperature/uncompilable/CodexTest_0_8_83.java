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


public class CodexTest_0_8_83 { 
  @Test
    public void testContains() {
        // given
        int[] array = { 1, 2, 3 };
        IntArrayList intArrayList = new IntArrayList(array);
        // when
        boolean result = intArrayList.contains(3);
        // then
        assertTrue(result);
    }
}