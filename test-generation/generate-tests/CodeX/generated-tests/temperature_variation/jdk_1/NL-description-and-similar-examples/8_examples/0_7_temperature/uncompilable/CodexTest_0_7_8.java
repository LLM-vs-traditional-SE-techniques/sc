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


public class CodexTest_0_7_8 { 
  @Test
  public void testRemoveByIndex() {
    assertEquals(new Integer(9), l.remove(8));
    assertEquals(new Integer(8), l.remove(7));
    assertEquals(new Integer(7), l.remove(6));
    assertEquals(new Integer(6), l.remove(5));
    assertEquals(new Integer(5), l.remove(4));
    assertEquals(new Integer(4), l.remove(3));
    assertEquals(new Integer(3), l.remove(2));
    assertEquals(new Integer(2), l.remove(1));
    assertEquals(new Integer(1), l.remove(0));
  }
}