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


public class CodexTest_0_6_5 { 
  @Test
  public void testContainsWithObject() {
    int[] array = { 0, 1, 2, 3 };
    assertTrue(ArrayUtils.contains(array, 0));
    assertFalse(ArrayUtils.contains(array, 4));
  }
}