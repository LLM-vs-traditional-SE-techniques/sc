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


public class CodexTest_0_5_22 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector(3);
        v.setElement(0, 1.1);
        v.setElement(1, 1.2);
        v.setElement(2, 1.3);
        assertTrue(v.contains(1.1));
        assertTrue(v.contains(1.2));
        assertTrue(v.contains(1.3));
        assertFalse(v.contains(1.4));
    }
}