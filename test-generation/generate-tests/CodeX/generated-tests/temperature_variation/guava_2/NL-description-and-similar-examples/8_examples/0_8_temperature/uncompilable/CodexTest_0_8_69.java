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


public class CodexTest_0_8_69 { 
  @Test
  public static void testWriteBytesTo() {
    final int cnt = 10;
    final int[] values = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
    for (int i = 0; i < cnt; i++) {
      MutableBloomFilter m =
          MutableBloomFilter.create(1000, Funnels.byteArrayFunnel(), values[i]);
      byte[] bytes = new byte[m.bits() / 8];
      m.writeBytesTo(bytes, 0, bytes.length);
      MutableBloomFilter n = MutableBloomFilter.readFrom(bytes, Funnels.byteArrayFunnel());
      assertEquals(m.bitSize(), n.bitSize());
      assertEquals(m.bitCount(), n.bitCount());
      assertEquals(m.expectedFpp(), n.expectedFpp());
      assertEquals(m.hashCount(), n.hashCount());
    }
  }
}