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


public class CodexTest_0_7_17 { 
  @Test
        public void testObjectRemove() {
            ArrayList list = new ArrayList();
            list.add(new Integer(1));
            list.add(new Integer(2));
            assertEquals(new Integer(1), list.remove(0));
            assertEquals(new Integer(2), list.get(0));
        }
        public void testObjectRemove_removeZero() {
            ArrayList list = new ArrayList();
            list.add(new Integer(1));
            list.add(new Integer(2));
            assertEquals(new Integer(1), list.remove(0));
            assertEquals(new Integer(2), list.get(0));
        }
}