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


public class CodexTest_0_7_10 { 
  @Test
  public void testContains() {
    List<String> list = new ArrayList<String>();
    list.add("lorem");
    list.add("ipsum");
    list.add("dolor");
    assertTrue(list.contains("lorem"));
    assertTrue(list.contains("ipsum"));
    assertTrue(list.contains("dolor"));
    assertFalse(list.contains("consectetur"));
    assertFalse(list.contains(null));
  }
}