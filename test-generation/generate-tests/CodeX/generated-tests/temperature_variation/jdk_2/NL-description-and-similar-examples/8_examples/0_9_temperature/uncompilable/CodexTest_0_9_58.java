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


public class CodexTest_0_9_58 { 
  @Test
  // need to select the output either true contains when o.equals is called or the other when false
  public void testContainsShouldReturnTrueWhenQueryApplyAndElementAreEquals() {
    // given
    int seed = 0;
    int max = 9;
    AlgVector v = new AlgVector(max);
    randInit(seed, max);
    double result = new Double(randDouble());
    for (int i = 0; i < max; i++) {
      v.setElement(i, result);
    }
    // when
    boolean containsResult = v.contains(result);
    // then
    assertTrue(containsResult);
  }
}
}