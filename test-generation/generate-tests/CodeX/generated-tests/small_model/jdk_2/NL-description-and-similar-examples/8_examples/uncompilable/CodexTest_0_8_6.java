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


public class CodexTest_0_8_6 { 
  @Test
  public void testContains() {
    AlgVector v = new AlgVector(1);
    assertTrue("contains(this)", v.contains(v));
    v.setRange(0, 0, AlgVector.ONE_D);
    assertTrue("contains(1)", v.contains(1));
    assertFalse("!contains(0)", v.contains(0));
  }
}