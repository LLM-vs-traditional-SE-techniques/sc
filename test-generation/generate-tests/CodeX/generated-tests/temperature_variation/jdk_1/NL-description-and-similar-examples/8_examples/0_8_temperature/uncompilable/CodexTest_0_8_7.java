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


public class CodexTest_0_8_7 { 
  @Test
  public void testRemoveAtIndex() {
        // Test removing first element
        String element = Integer.toString(0);
        ImmutableList<String> lst = ImmutableList.of(
                element,
                Integer.toString(1),
                Integer.toString(2));
        ImmutableList<String> newList = lst.remove(0);
        ImmutableList<String> expected = ImmutableList.of(
                Integer.toString(1),
                Integer.toString(2));
        assertEquals(expected, newList);
}