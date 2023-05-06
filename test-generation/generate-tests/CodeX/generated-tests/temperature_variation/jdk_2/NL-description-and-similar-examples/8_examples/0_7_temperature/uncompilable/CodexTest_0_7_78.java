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


public class CodexTest_0_7_78 { 
  @Test
    public void testContains() {
        Collection c = collection;
        assertTrue("Returned false for contained object", c.contains(new Integer(0)));
        assertTrue("Returned true for uncontained object", !c.contains(new Integer(-1)));
    }
}