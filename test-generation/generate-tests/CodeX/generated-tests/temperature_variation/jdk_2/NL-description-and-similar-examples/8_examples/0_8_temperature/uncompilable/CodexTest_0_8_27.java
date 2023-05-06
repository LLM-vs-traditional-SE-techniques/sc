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


public class CodexTest_0_8_27 { 
  @Test
    public void testContains() {
        AlgVector v = new AlgVector();
        v.addElement(2.3);
        v.addElement(1.2);
        v.addElement(5.0);
        assertTrue("Containing the first element failed", v.contains(2.3));
        assertTrue("Containing the second element failed", v.contains(1.2));
        assertTrue("Containing the third element failed", v.contains(5.0));
        assertFalse("Containing a value not in the vector did not fail",
            v.contains(0.0));
    }
}