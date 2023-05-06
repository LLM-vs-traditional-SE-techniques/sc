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


public class CodexTest_0_8_9 { 
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveThrowIndexException() throws IndexOutOfBoundsException {
        try {
            l.remove(100);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index: " + 100 + ", Size: " + l.getSize());
        }
    }
}