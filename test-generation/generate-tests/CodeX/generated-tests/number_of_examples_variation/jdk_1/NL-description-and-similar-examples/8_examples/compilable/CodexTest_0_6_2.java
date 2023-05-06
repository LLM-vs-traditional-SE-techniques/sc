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
    public void testRemove() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3));
        l.remove(Integer.valueOf(2));
        assertTrue(l.equals(Arrays.asList(1, 3)));
    }
}