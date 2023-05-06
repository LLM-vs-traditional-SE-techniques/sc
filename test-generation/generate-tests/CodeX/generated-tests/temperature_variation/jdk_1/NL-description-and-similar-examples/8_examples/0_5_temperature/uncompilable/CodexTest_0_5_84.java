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


public class CodexTest_0_5_84 { 
  @Test
        public void testRemove() {
        for (int i = 0; i < size(); i++) {
            String s = String.valueOf(i);
            assertEquals(s, list.remove(0));
        }
        expectIndexOutOfBoundsException(() -> list.remove(0));
        expectIndexOutOfBoundsException(() -> list.remove(1));
        expectIndexOutOfBoundsException(() -> list.remove(Integer.MAX_VALUE));
    }
}