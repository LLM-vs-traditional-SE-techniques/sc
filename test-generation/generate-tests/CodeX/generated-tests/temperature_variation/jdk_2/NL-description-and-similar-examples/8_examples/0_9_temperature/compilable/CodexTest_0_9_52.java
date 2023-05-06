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


public class CodexTest_0_9_52 { 
  @Test
  public void testContainsWhenPositive() {
  // given:
  boolean expected = true;
  List<Integer> target = Arrays.asList(1, 2);
  // when:
  boolean result = target.contains(2);
  // then:
  assertEquals(expected, result);
  }
}