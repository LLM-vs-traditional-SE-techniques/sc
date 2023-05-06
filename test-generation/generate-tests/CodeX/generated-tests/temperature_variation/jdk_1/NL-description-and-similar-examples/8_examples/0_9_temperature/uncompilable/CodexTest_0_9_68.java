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


public class CodexTest_0_9_68 { 
  @Test
            @SuppressWarnings("nullness") // circularity declared in annotations
            public void testGet() throws Exception {
            int n = data.length;
            assertThat(n, is(nRows * nCols));
            int i = 0;
            for (int c = 0; c < nCols; ++c) {
}