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


public class CodexTest_0_7_70 { 
  @Test
    public void testContains() {
        ArrayList a = new ArrayList();
        a.add("1");
        a.add("2");
        assertTrue("should contain 1", a.contains("1"));
        assertTrue("should not contain 3", !a.contains("3"));
    }
}