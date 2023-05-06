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


public class CodexTest_0_9_70 { 
  @Test
  public static void testFailureOnRemoveWithIndices() {
        Seq<Integer> seq = Seq.empty().append(5, 6, 3).append(5, 6, 3);
        try {
            seq.removeWith(xi -> xi);
            fail();
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("duplicate"));
        }
    }
}