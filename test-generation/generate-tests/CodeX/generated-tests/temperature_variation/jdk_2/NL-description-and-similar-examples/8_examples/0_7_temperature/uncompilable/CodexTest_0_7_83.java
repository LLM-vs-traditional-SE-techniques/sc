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


public class CodexTest_0_7_83 { 
  @Test
  public void testContains() {
        assertFalse(new ListAdapter<String>(new EmptyList<String>()).contains("test"));
        assertTrue(new ListAdapter<String>(Arrays.asList("test")).contains("test"));
        assertFalse(new ListAdapter<String>(Arrays.asList("test", "test2")).contains("test3"));
    }
}