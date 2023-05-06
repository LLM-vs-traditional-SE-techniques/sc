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


public class CodexTest_0_6_96 { 
  @Test
    public void testRemove() {
        final int size = 5;
        final Vector1D[] vectors = new Vector1D[size];
        for (int i = 0; i < size; ++i) {
            vectors[i] = new Vector1D(i);
        }
        final Vector1D[] originalVectors = new Vector1D[size];
        System.arraycopy(vectors, 0, originalVectors, 0, size);
        final Vector1D removed = vectors[3];
        final Vector1D[] expected = new Vector1D[size - 1];
        System.arraycopy(originalVectors, 0, expected, 0, 3);
        System.arraycopy(originalVectors, 4, expected, 3, size - 4);
        final Vector1D[] actual = new Vector1D[size - 1];
        System.arraycopy(originalVectors, 0, actual, 0, 3);
        System.arraycopy(originalVectors, 4, actual, 3, size - 4);
        final Vector1D[] subVectors = Arrays.copyOfRange(vectors, 0, size - 1);
        Assert.assertArrayEquals(subVectors, actual);
        Assert.assertEquals(removed, vectors[3]);
        Assert.assertEquals(removed, originalVectors[3]);
    }
}