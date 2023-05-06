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


public class CodexTest_0_9_12 { 
  @Test
  public void testRemoveByIndexUsingItself() {
        Vector<String> list = new Vector<String>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals("bar", list.remove(list.indexOf("bar")));
  }
}