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


public class CodexTest_0_5_5 { 
  @Test
    public void testContains() {
        assertTrue("contains(3)", list.contains(new Integer(3)));
        assertTrue("contains(5)", list.contains(new Integer(5)));
        assertTrue("contains(7)", list.contains(new Integer(7)));
        assertTrue("contains(9)", list.contains(new Integer(9)));
        assertFalse("contains(1)", list.contains(new Integer(1)));
        assertFalse("contains(2)", list.contains(new Integer(2)));
        assertFalse("contains(4)", list.contains(new Integer(4)));
        assertFalse("contains(6)", list.contains(new Integer(6)));
        assertFalse("contains(8)", list.contains(new Integer(8)));
        assertFalse("contains(10)", list.contains(new Integer(10)));
    }
}