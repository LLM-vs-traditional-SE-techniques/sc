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


public class CodexTest_0_7_10 { 
  @Test
    
Input: public Vector1D mapAddToSelf(double d) {
        return mapAddToSelf(Double.valueOf(d));
    }
Output: public void testMapAddToSelf() {
        Vector1D v = new Vector1D(-1);
        v.mapAddToSelf(1.1);
        Assert.assertTrue(FastMath.abs(v.getX() - 0.1) < 1.0e-12);
    }
}