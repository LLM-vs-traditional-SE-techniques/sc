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


public class CodexTest_0_5_1 { 
  @Test
  public void testWriteBytesTo() {
    int n = 100;
    byte[] bytes = new byte[n];
    Random r = new Random(0);
    for (int i = 0; i < n; i++) {
      bytes[i] = (byte) r.nextInt();
    }
    int bits = n * 8;
    BloomFilter<Integer> filter = BloomFilter.create(
        Funnels.integerFunnel(), bits, 0.01);
    for (int i = 0; i < n; i++) {
      filter.put(i);
    }
    byte[] out = new byte[n];
    int numBytes = filter.writeBytesTo(out, 0, n);
    assertEquals(bits / 8, numBytes);
    assertEquals(new ByteArrayInputStream(bytes), new ByteArrayInputStream(out));
  }
}