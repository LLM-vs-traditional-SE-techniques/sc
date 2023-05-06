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


public class CodexTest_0_8_32 { 
  @Test
  public void testContainsTrue() {
    // given
    AlgVector v = new AlgVector(3);
    ArrayList<Double> al = new ArrayList<Double>();
    al.add(1.0);
    al.add(2.0);
    al.add(3.0);
    v.set(al);
    // when
    boolean actual = v.contains(1.0);
    // then
    assertTrue(actual);
    assertFalse(v.contains(10.0));
}
}