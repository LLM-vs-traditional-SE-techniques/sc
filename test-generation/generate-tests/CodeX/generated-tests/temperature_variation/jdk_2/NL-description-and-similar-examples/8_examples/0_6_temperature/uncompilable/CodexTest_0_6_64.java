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


public class CodexTest_0_6_64 { 
  @Test
    public void testContains() {
        assertTrue("contains(get(0))", list.contains(list.get(0)));
        assertTrue("contains(get(1))", list.contains(list.get(1)));
        assertTrue("contains(get(-1))", list.contains(list.get(list.size() - 1)));
        assertTrue("contains(get(size/2))", list.contains(list.get(list.size() / 2)));
        assertFalse("contains(new Object())", list.contains(new Object()));
        assertFalse("contains(null)", list.contains(null));
    }
}