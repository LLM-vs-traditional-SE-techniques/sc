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


public class CodexTest_0_8_72 { 
  @Test
    public void testAddInMiddle() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 4);
        list.add(1, 5);
        list.add(0, 3);
        list.add(1, 4);
        list.add(1, Integer.valueOf(4));
        assertEquals(Arrays.asList(3, 4, 4, 5), list);
    }
}