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


public class CodexTest_0_8_5 { 
  @Test
  public void testWriteBytesTo() {
    Random random = new Random(0);
    for (int i = 0; i < 1000; i++) {
      boolean[] bits = new boolean[i];
      for (int j = 0; j < i; j++) {
        bits[j] = random.nextBoolean();
      }
      BitArray bs = new BitArray(bits);
      byte[] bytes = bitsToBytes(bits);
      byte[] sink = new byte[bytes.length];
      int length = bs.writeBytesTo(sink, 0, bytes.length);
      assertEquals(length, bytes.length);
      assertEquals(bytes, Arrays.copyOf(sink, bytes.length));
    }
  }
}