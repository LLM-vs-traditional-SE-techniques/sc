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


public class CodexTest_0_6_1 { 
  @Test
  public void testWriteBytesToDestTooSmall() {
    byte[] dest = new byte[4];
    int bits = 32;
    int bytes = 4;
    BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), bits);
    assertEquals(bytes, filter.writeBytesTo(dest, 0, bytes));
    assertEquals(bytes, filter.writeBytesTo(dest, 0, bytes * 2));
    assertEquals(bytes, filter.writeBytesTo(dest, 0, bytes * 3));
    try {
      filter.writeBytesTo(dest, 0, 3);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
  }
}