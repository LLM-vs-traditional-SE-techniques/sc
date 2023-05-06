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


public class CodexTest_0_7_47 { 
  @Test
    public void testContainsObject() {
        AlgVector v = new AlgVector(3);
        v.setElement(0, 1.0);
        v.setElement(1, 2.0);
        v.setElement(2, 3.0);
        assertTrue("Should contain 2.0", v.contains(2.0));
        assertTrue("Should contain 2.0", v.contains(new Double(2.0)));
        assertFalse("Should not contain 2.5", v.contains(2.5));
    }
}