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


public class CodexTest_0_5_2 { 
  @Test
    public void testRemoveWithIndex() {
        Object[] elements = {1, 2, 3, 4, 5};
        List<Object> list = new ArrayList<>(Arrays.asList(elements));
        list.remove(2);
        Object[] expected = {1, 2, 4, 5};
        assertArrayEquals(expected, list.toArray());
    }
}