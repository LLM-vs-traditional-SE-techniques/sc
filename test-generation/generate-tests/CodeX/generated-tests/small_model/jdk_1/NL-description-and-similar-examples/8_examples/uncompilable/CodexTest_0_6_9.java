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


public class CodexTest_0_6_9 { 
  @Test
    @Override
    public boolean add(Object o) {
        Objects.requireNonNull(o);
        final int size = this.size;
        if (size == elementData.length) {
            grow(size + 1);
        }
        int index = this.size;
        elementData[index] = o;
        this.size = index + 1;
        return true;
    }
}