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


public class CodexTest_0_8_99 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector(22);
        for (int i = 0; i < 22; i++) v.setElement(i, i);
        assertFalse(v.contains(null));
        assertTrue(v.contains(Integer.valueOf(1)));
        assertFalse(v.contains(Integer.valueOf(22)));
    }
}