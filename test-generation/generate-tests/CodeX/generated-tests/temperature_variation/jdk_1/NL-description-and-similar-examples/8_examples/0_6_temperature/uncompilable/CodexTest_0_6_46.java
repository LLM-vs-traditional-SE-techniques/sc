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


public class CodexTest_0_6_46 { 
  @Test
    public void testRemoveRange() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        list.subList(1, 4).clear();
        assertEquals(ImmutableList.of(1, 5), list);
    }
}