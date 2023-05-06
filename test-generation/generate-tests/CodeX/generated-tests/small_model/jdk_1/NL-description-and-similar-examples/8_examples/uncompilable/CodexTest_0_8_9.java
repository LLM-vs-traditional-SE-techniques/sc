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
  @Test
    @Override
    int indexOf(Object object) { // public int indexOf(Object o) {
        Objects.requireNonNull(object);
        final Object[] es = elementData;
        if (es == null) {
            return -1; // concurrent modification
        }
        final int elementDataLength = es.length;
        if (elementDataLength == 0) {
            return -1;
        }
        return indexOf(es, 0, elementDataLength, object);
    }
}