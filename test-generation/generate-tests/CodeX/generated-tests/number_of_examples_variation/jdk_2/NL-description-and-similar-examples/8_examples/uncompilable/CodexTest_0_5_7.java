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


public class CodexTest_0_5_7 { 
  @Test
    public void testContains() {
        // given
        AlgVector v = new AlgVector(new double[]{2.3, 1.2, 5.0});
        // when
        boolean result = v.contains(5.0);
        // then
        assertTrue(result);
    }
}