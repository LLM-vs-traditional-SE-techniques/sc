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


public class CodexTest_0_4_9 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 0, 4));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 0, 5));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 0, 100));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 1, 4));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 1, 5));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 1, 100));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 2, 4));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 2, 5));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 2, 100));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 3, 4));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 3, 5));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 3, 100));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 4, 4));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 4, 5));
    assertEquals(4, new BloomFilter<Integer>(10, 0.03).writeBytesTo(dest, 4, 100));
  }
}