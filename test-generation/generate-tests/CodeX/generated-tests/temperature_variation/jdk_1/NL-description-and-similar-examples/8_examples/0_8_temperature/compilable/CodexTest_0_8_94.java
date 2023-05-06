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


public class CodexTest_0_8_94 { 
  @Test
  public void testRemoveRange() {
    List<Object> list = new ArrayList<Object>();
    list.add("a");
    list.add("b");
    list.remove(0);
    list.remove(0);
    assertEquals("list should be empty", Collections.<Object>emptyList(), list);
    try {
      list.remove(0);
      fail("Expected IndexOutOfBoundsException on remove of empty list");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }
  
  public void testRemoveRangeMid() {
    List<Object> list = new ArrayList<Object>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.remove(1);
    list.remove(1);
    assertEquals("list should contain a", Collections.singletonList("a"), list);
    try {
      list.remove(1);
      fail("Expected IndexOutOfBoundsException on remove of empty list");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }
}