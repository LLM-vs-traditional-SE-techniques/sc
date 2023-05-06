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


public class CodexTest_0_5_31 { 
  @Test
    public void testRemove() {
        int size = list.size();
        Object o = list.remove(0);
        assertEquals(size-1, list.size());
        assertFalse(list.contains(o));
    }
}