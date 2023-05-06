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


public class CodexTest_0_9_80 { 
  @Test
  public void testRemove_Specified_Valid_Exists() {
            int expectedSize = getCollection().size() - 1;
            Object o = getArray()[1];
            assertTrue(getCollection().remove(o));
            assertEquals(expectedSize, getCollection().size());
            assertFalse(getCollection().contains(o));
        }
}