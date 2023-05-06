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


public class CodexTest_0_8_3 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector(5);
        assertTrue("Contains 5", v.contains(5));
        v.setElement(5, 21.0);
        assertTrue("Contains 5", v.contains(5));
        v.setElement(5, 5.0);
        assertTrue("Contains 5.0", v.contains(5.0));
        v.setElement(5, 21.0);
        assertFalse("Does not contain 5.0", v.contains(5.0));
    }

}