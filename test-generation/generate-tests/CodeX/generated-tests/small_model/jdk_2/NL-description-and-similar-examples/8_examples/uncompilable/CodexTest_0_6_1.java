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


public class CodexTest_0_6_1 { 
  @Test
  public void testContainsElement() {
    assertEquals(false, new AlgVector(new double[] {1}).contains(new Double(2)));
    assertEquals(true, new AlgVector(new double[] {1}).contains(new Double(1)));
  }
}