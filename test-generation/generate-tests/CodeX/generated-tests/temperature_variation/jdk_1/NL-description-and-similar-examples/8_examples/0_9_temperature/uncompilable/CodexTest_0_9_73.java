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


public class CodexTest_0_9_73 { 
  @Test
        public void remove() {
        if (this.cursor < 0) throw new IllegalStateException();
        Object[] elementData = ArrayList.this.elementData;
        if (this.lastRet < 0) throw new IllegalStateException();
        try {
            ArrayList.this.remove(this.lastRet);
            cursor = this.lastRet;
            lastRet = -1;
        } catch (IndexOutOfBoundsException ex) {
          throw new ConcurrentModificationException();
        }
      }
}