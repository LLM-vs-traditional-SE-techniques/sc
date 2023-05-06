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


public class CodexTest_0_6_62 { 
  @Test
  public void testRemove() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        list.remove(0);
        assertEquals(Arrays.asList(2, 3, 4, 5), list);
        list.remove(2);
        assertEquals(Arrays.asList(2, 3, 5), list);
        list.remove(list.size() - 1);
        assertEquals(Arrays.asList(2, 3), list);
    }
}