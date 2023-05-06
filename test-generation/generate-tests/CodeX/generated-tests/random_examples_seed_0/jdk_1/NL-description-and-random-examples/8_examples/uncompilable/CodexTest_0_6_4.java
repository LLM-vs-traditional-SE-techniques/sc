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


public class CodexTest_0_6_4 { 
  @Test
  public void testRemove() {
    assertEquals(0, list.size());
    list.add(1);
    assertEquals(1, list.size());
    list.add(2);
    assertEquals(2, list.size());
    list.remove(1);
    assertEquals(1, list.size());
    assertEquals(1, list.get(0));
  }

}