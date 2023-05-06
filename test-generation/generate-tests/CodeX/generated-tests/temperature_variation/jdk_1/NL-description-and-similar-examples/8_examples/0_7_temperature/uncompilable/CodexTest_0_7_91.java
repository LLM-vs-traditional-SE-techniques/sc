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


public class CodexTest_0_7_91 { 
  @Test
    public void testRemoveByIndex() {
        int size = list.size();
        for (int index = 0; index < size; index++) {
            Object obj = list.remove(0);
            assertTrue(!list.contains(obj));
        }
        assertEquals(0, list.size());
    }

}