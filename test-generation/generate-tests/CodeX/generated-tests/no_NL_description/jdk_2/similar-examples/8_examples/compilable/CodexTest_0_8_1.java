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


public class CodexTest_0_8_1 { 
  @Test
    public void testContains() {
        Vector v = new Vector();
        assertFalse(v.contains(null));
        v.addElement(null);
        assertTrue(v.contains(null));
        v = new Vector();
        assertFalse(v.contains(this));
        v.addElement(this);
        assertTrue(v.contains(this));
    }
}