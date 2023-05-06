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


public class CodexTest_0_9_84 { 
  @Test
  private static final class Pair<T> {
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (o instanceof Pair) {
                Pair<?> that = (Pair<?>) o;
                return this.first.equals(that.first)
                    && this.second.equals(that.second);
            } else {
                return false;
            }
        }
    }
}