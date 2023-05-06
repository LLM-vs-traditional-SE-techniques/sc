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


public class CodexTest_0_6_2 { 
  @Test
    public void testContainsObject() {
        AlgVector v = new AlgVector();
        assertFalse(v.contains(new Integer(1)));
        v.addElement(new Integer(1));
        assertTrue(v.contains(new Integer(1)));
        assertFalse(v.contains(new Integer(2)));
        v.addElement(new Integer(2));
        assertTrue(v.contains(new Integer(2)));
    }
}