import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
  public void testWriteBytesToWithMaxLengthShorterThanResult() {
    byte[] expected = new byte[] {0, 1, 1, 0, 1, 1, 0, 1};
    byte[] actual = new byte[expected.length];
    BitArray bits = BitArray.fromBytes(expected);
    int written = bits.writeBytesTo(actual, 0, 3);
    assertEquals(3, written);
    assertEquals(
        BitArray.fromBytes(new byte[] {0, 1, 1}),
        BitArray.fromBytes(Arrays.copyOf(actual, written)));
  }
  
Input: public boolean contains(Object o) {
    return indexOf(o) >= 0;
  }
Output: public void testContains() {
    CustomConcurrentHashMap<String, String> map =
        CustomConcurrentHashMap.create();
    map.put("foo", "bar");
    assertTrue(map.contains("foo"));
    assertFalse(map.contains("baz"));
  }
  
Input: public boolean containsKey(Object key) {
    return get(key) != null;
  }
Output: public void testContainsKey() {
    CustomConcurrentHashMap<String, String> map =
       
}