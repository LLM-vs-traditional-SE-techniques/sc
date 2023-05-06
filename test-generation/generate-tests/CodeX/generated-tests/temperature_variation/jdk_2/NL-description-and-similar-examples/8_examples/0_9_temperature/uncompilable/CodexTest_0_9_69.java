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


public class CodexTest_0_9_69 { 
  @Test
    public void testContains() {
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        Integer c = new Integer(3);
        Integer d = new Integer(4);
        Integer e = new Integer(5);
        ArrayList l1 = new ArrayList( Arrays.asList( new Object[] { a, b, c, d, e } ) );
        ArrayList l2 = new ArrayList( Arrays.asList( new Object[] { a, b, c, d, e } ) );
}