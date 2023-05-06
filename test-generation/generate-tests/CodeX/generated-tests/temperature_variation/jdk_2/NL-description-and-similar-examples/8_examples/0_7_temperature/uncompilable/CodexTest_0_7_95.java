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


public class CodexTest_0_7_95 { 
  @Test
    public void testContains() {
        final UnmodifiableMatrix m = new UnmodifiableMatrix(new SimpleMatrix(2, 3, true, 1, 0, 2, 3, 0, 4));
}