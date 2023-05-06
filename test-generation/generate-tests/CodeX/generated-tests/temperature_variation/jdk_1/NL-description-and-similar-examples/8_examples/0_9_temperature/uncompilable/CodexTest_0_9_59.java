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


public class CodexTest_0_9_59 { 
  @Test
    public void testRemove_givenMinSizeAndBlock_whenRemoved_thenCorrectSize()
            throws InterruptedException {
        final int givenMinSize = 50;
        final int blockSize = 10;
        ConcurrentLinkedDeque<Object> sut = new ConcurrentLinkedDeque<>(givenMinSize, blockSize);
        fillWithDummies(sut, blockSize);
}