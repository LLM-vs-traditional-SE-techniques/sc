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


public class CodexTest_0_7_6 { 
  @Test
    public void testContains() {
        int size = l.size();
        for (int i=0; i<size; i++) {
            assertTrue(l.contains(new Integer(i)));
        }
        assertTrue(!l.contains(new Integer(-1)));
        assertTrue(!l.contains(new Integer(size)));
    }
}