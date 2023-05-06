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


public class CodexTest_0_9_8 { 
  @Test
  public void testContainsShouldReturnTrueWhenXGiven() {
    // given
    AlgVector v = new AlgVector(1, 2.0);
    // when
    boolean result = v.contains(new Double(1.0));
    // then
    assertTrue("X not found", result);
  }
}