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


public class CodexTest_0_7_55 { 
  @Test
    public void testRemoveIndex() {
        for (int i = 0; i < elements.length; i++) {
            assertEquals(elements[i], list.get(i));
        }
        for (int i = 0; i < elements.length; i++) {
            try {
                list.remove(i);
                if (i < elements.length - 1) {
                    assertEquals(elements[i + 1], list.get(i));
                }
            } catch (Exception e) {
                fail("Unexpected exception: " + e);
            }
        }
    }
}