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
    @SuppressWarnings("unchecked")
    public void testRemove() {
        final Object[] es = elementData;
        int size = es.length;
        for (int i = 0; i < size; i++) {
            assertEquals(es[i], list.remove(0));
        }
        assertEquals(0, list.size());
    }
}