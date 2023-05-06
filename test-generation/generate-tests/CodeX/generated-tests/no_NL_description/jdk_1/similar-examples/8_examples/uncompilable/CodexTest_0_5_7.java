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


public class CodexTest_0_5_7 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 100; i++) {
            Object o = new Object();
            list.add(o);
            assertTrue(list.remove(o));
            assertFalse(list.remove(o));
        }
    }
}