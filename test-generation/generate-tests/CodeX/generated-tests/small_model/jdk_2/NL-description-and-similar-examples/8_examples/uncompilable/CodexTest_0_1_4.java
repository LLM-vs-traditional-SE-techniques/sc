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


public class CodexTest_0_1_4 { 
  @Test
    public void testContains() {
        assertTrue(new AlgVector(1.0, 2.0, 3.0).contains(1.0));
        assertTrue(new AlgVector(1.0, 2.0, 3.0).contains(2.0));
        assertTrue(new AlgVector(1.0, 2.0, 3.0).contains(3.0));
        assertFalse(new AlgVector(1.0, 2.0, 3.0).contains(4.0));
    }
}