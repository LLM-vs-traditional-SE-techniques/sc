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


public class CodexTest_0_8_29 { 
  @Test
    public void testContains_00() {
        //given
        ArrayDeque<String> testInstance = new ArrayDeque<String>();
        testInstance.addFirst("foo");
        //when
        boolean containsFoo = testInstance.contains("foo");
        //then
        assertTrue("contains() should return true for element added to the ArrayDeque", containsFoo);
    }
}