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


public class CodexTest_0_7_14 { 
      @Test
      public void testContainsObject() {
          int index = 10;
          Object object = new Object();
          BooleanArrayList list = new BooleanArrayList(20);
          list.set(index, true);
          assertFalse("List should not contain object.", list.contains(object));
          assertTrue("List should contain object.", list.contains(Boolean.TRUE));
          assertFalse("List should not contain object.", list.contains(Boolean.FALSE));
      }
}