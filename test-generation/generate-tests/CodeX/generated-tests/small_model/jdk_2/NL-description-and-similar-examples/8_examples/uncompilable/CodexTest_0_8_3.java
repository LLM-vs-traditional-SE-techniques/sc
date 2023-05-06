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


public class CodexTest_0_8_3 { 
  @Test
    public void testContains(){
        int[] data = {1, 2, 3};
        AlgIndexedVector v = new AlgIndexedVector(data);
        assertTrue(v.contains(5));
        assertFalse(v.contains(0));
    }
}