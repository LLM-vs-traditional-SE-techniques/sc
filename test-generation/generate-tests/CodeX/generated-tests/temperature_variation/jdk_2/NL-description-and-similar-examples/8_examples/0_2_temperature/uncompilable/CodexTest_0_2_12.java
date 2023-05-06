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


public class CodexTest_0_2_12 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector(3);
        assertFalse(v.contains(new Double(1.0)));
        v.setElement(0, 1.0);
        assertTrue(v.contains(new Double(1.0)));
    }
}