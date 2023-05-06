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


public class CodexTest_0_9_7 { 
  @Test
  public void testRemoveNull() {
    ArrayList<Object> arr = new ArrayList<>();
    arr.add(null);
    ListIterator<Object> listItr = arr.listIterator();
    assertTrue(listItr.hasNext());
    assertNull(listItr.next());
    assertTrue(listItr.hasPrevious());
    assertNull(listItr.previous());
    listItr.remove();
    assertEquals(0, arr.size());
    assertFalse(listItr.hasNext());
  }

}