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


public class CodexTest_0_8_62 { 
  @Test
     public void testContains() {
        AbstractCollection l = createCollection();
        assertFalse("The list should not contain xyzzy", l.contains("xyzzy"));
        assertTrue("The list should contain foo", l.contains("foo"));
    }
}