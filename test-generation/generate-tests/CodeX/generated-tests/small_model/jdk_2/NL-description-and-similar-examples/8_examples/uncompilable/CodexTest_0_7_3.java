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


public class CodexTest_0_7_3 { 
  @Test
    @Override
    public boolean contains(Object o) {
      if (o == null) {
        for (int i = 0; i < m_Elements.length; i++) {
          if (m_Elements[i] == null) {
            return true;
          }
        }
      } else {
        for (int i = 0; i < m_Elements.length; i++) {
          if (o.equals(m_Elements[i])) {
            return true;
          }
        }
      }
      return false;
    }

}