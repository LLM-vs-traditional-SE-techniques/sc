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


public class CodexTest_0_9_1 { 
  @Test
    public void testRemoveInt() {
        list= makeFullList();
        try {
            list.remove(-1);
            fail("Should throw IndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e) {
            // Expected
        }
    }
}