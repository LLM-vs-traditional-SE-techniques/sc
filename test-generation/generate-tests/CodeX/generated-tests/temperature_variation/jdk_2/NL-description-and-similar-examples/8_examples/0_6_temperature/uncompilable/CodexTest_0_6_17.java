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


public class CodexTest_0_6_17 { 
  @Test
    public void testContains() {
        assertFalse(Lists.newArrayList().contains(1));
        List<Integer> list = Lists.newArrayList(1, 2, 3);
        assertTrue(list.contains(1));
        assertFalse(list.contains(4));
    }
}