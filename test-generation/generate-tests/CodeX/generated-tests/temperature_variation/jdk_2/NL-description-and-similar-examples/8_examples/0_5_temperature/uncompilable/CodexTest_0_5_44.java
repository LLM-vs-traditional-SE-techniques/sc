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


public class CodexTest_0_5_44 { 
  @Test
    public void testContains() {
        assertTrue("ArrayList should contain 42", al.contains(new Integer(42)));
        assertFalse("ArrayList should not contain 666", al.contains(new Integer(666)));
        assertFalse("ArrayList should not contain null", al.contains(null));
    }
}