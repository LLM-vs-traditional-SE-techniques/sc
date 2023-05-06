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


public class CodexTest_0_8_11 { 
  @Test
        public void testRemoveIndex() throws Exception {
            list.add("1");
            list.add("2");
            list.add("3");
            Assert.assertEquals("2", list.remove(1));
            Assert.assertEquals(2, list.size());
            Assert.assertEquals("1", list.get(0));
            Assert.assertEquals("3", list.get(1));
        }
}