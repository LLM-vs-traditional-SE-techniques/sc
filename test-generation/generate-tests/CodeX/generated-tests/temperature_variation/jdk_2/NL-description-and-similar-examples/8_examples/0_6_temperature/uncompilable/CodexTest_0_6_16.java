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


public class CodexTest_0_6_16 { 
  @Test
    public void testContains() {
        assertTrue("Should contain null", list.contains(null));
        assertTrue("Should contain 0", list.contains(new Integer(0)));
        assertTrue("Should contain 1", list.contains(new Integer(1)));
        assertFalse("Should not contain 2", list.contains(new Integer(2)));
    }
}