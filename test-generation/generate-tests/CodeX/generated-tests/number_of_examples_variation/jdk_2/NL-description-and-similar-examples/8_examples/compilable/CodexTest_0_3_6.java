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


public class CodexTest_0_3_6 { 
  @Test
    public void testContains() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = -2; i < 3; i++) {
            list.add(i);
        }
        for (int i = -2; i < 3; i++) {
            assertTrue(list.contains(i));
        }
        assertTrue(!list.contains(5));
    }
}