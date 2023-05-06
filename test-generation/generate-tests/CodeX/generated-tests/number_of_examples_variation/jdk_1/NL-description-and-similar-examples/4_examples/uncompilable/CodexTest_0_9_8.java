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


public class CodexTest_0_9_8 { 
  @Test
   public void testRemoveByIndex() {
      // The second parameter is an index
      List<String> list = new ArrayList<String>();
      list.add("a1"); // [a1]
      list.add("a2");
      list.add("a3");
      list.add("a4");
      assertEquals("a2", list.remove(1));
      assertEquals("a1", list.get(0));
      assertNull(list.remove(4));
      assertEquals("a4", list.get(list.size() - 1));
      assertEquals("a4", list.remove(list.size() - 1));
}