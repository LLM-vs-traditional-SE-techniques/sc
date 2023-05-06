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


public class CodexTest_0_9_38 { 
  @Test
    public void testRemoveFromBackingArray() {
        E[] backingArray = createArrayOfLength(3);
        backingArray[0] = null;
        backingArray[1] = null;
        backingArray[2] = first;
        List<E> list = list(backingArray);
}