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


public class CodexTest_0_9_3 { 
  @Test
    public void testRemoveObject() {
      ArrayList<Integer> A = new ArrayList<Integer>();
      A.add(0,new Integer(5));
      A.add(1,new Integer(4));
      A.add(2,new Integer(3));
      A.add(3,new Integer(2));
      A.add(4,new Integer(1));
      assertEquals("Wrong value",1,A.remove(4));
  }
}