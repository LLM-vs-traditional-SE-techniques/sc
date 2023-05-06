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


public class CodexTest_0_8_8 { 
  @Test
        class MyHashMap<K,V> {
            private final HashMap<K, V> map = new HashMap<K, V>();
            public V get(Object key) {
                return map.get(key);
            }
        }
        
        public void testHashMap() {
            MyHashMap<String, String> m = new MyHashMap<String, String>();
            assertThat(m.get("test"), nullValue());
            m.put("test", "test");
            assertThat(m.get("test"), equalTo("test"));
        }
}