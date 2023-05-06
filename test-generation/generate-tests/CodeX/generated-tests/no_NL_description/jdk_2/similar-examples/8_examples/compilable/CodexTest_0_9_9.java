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


public class CodexTest_0_9_9 { 
  @Test
    public void testContainsObject() {
    ArrayList<String> arrayList = new ArrayList<>();
    assertTrue(arrayList.isEmpty());
    assertFalse(arrayList.contains("foo"));
    arrayList.add("bar");
    arrayList.add("foo");
    assertTrue(arrayList.contains("foo"));
    }
}