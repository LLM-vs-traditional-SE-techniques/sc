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


public class CodexTest_0_7_7 { 
  @Test
  public void testRemove() {
    int size = 10;
    Object[] a = new Object[size];
    for (int i = 0; i < size; i++) {
      a[i] = new Integer(i);
    }
    for (int i = 0; i < size; i++) {
      assertEquals(a[i], elementData(a).remove(i));
    }
    assertEquals(0, elementData(a).size());
  }
}