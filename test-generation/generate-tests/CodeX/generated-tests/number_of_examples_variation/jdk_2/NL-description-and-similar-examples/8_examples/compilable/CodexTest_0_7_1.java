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


public class CodexTest_0_7_1 { 
  @Test
    public void testContains() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int len = random.nextInt(100);
            List<Integer> list = new ArrayList<Integer>(len);
            for (int j = 0; j < len; j++) {
                list.add(j);
            }
            Collections.shuffle(list, random);
            for (int j = 0; j < len; j++) {
                assertTrue("list should contain value " + j, list.contains(j));
            }
        }
    }
}