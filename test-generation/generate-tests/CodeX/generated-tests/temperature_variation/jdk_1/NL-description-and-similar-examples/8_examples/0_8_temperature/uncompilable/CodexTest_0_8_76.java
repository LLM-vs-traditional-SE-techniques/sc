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


public class CodexTest_0_8_76 { 
  @Test
                                boolean[] original = new boolean[]{ true, false, true, false, true, false };
                                BitSet set = new BitSet();
                                for (int i = 0; i < original.length; i++) {
                                        if (original[i]) {
                                                set.set(i);
                                        }
                                }
                                assertEquals(true, set.get(0));
                                assertEquals(false, set.get(1));
                                assertEquals(true, set.get(2));
                                assertEquals(false, set.get(3));
                                assertEquals(true, set.get(4));
                                assertEquals(false, set.get(5));
                                set.remove(2);
                                assertEquals(true, set.get(0));
                                assertEquals(false, set.get(1));
                                assertEquals(false, set.get(2));
                                assertEquals(false, set.get(3));
                                assertEquals(true, set.get(4));
                                assertEquals(false, set.get(5));
                                try {
                                        set.remove(-1);
                                        fail("Should throw IndexOutOfBoundsException");
                                } catch (IndexOutOfBoundsException e) {
                                        // expected
                                }
                                try {
                                        set.remove(6);
                                        fail("Should throw IndexOutOfBoundsException");
                                } catch (IndexOutOfBoundsException e) {
                                        // expected
                                }
                                set.remove(5);
                                assertEquals(true, set.get(0));
                                assertEquals(false, set.get(1));
                                assertEquals(false, set.get(2));
                                assertEquals(false, set.get(3));
                                assertEquals(true, set.get(4));
                                assertEquals(false, set.get(5));
                                set.remove(0);
                                assertEquals(false, set.get(0));
                                assert
}