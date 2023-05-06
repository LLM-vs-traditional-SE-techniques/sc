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


public class CodexTest_0_8_41 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector();
        double[] data = {2.3, 1.2, 5.0};
        v.add(data);
        assertTrue("Contains 2.3?", v.contains(2.3));
        assertFalse("Contains 6.0?", v.contains(6.0));
    }
}