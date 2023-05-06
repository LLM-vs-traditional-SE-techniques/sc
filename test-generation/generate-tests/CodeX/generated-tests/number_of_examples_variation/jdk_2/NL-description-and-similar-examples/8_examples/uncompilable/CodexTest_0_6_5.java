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


public class CodexTest_0_6_5 { 
  @Test
    public void testContains() {
        for (int i = 0; i < SIZE; i++) {
            assertTrue(list1.contains(new Integer(i)));
        }
        for (int i = 0; i < SIZE; i++) {
            assertTrue(list2.contains(new Integer(i)));
        }
        for (int i = 0; i < SIZE; i++) {
            assertTrue(list3.contains(new Integer(i)));
        }
    }
}