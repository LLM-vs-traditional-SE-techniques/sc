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


public class CodexTest_0_8_65 { 
  @Test
    public void testContains() {
        assertTrue(list.contains(null));
        for (int i = 0; i < list.size(); ++i) {
            assertTrue(list.contains(new Integer(i)));
        }
        assertTrue(list.contains(new Integer(list.size())));
        assertFalse(list.contains(new Integer(-1)));
        assertTrue(list.contains(new Integer(list.size() - 1)));
    }

}