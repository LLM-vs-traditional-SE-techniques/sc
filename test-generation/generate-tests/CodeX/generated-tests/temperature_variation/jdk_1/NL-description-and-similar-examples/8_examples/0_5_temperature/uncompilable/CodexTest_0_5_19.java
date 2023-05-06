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


public class CodexTest_0_5_19 { 
  @Test
    public void testRemoveRange() {
        final Object[] array = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        final List<Object> list = new ArrayList<>(Arrays.asList(array));
        assertEquals(Arrays.asList(array), list);
}