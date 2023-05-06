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


public class CodexTest_0_9_41 { 
  @Test
    public void testIndexOfNull() {
            BitSet bs = new BitSet();
            Object[] objArray = new Object[1];
            objArray[0] = null;
            bs.add(0);
            assertEquals(0, bs.indexOf(null, 0));
        }
}