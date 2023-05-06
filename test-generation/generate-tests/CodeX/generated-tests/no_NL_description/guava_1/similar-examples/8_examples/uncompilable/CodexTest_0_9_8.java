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


public class CodexTest_0_9_8 { 
  @Test
  public void testLongHash64() {
    // 64 lower bits
    for (long i = 0; i < 1L << 12; i += 1L << 10) {
      long max = Math.max(i, 1L);
      for (int j = 0; j < max; ++j) {
        HashCode hashCode = HashCode.fromLong(i + (j & 0xff));
        assertEquals(hashCode, HashCode.fromBytes(LittleEndian.longToBytes(i + (j & 0xff))));
        assertEquals(hashCode,
            HashCode.fromLong(i + (j & 0xff), MoreObjects.hashCode(1, 2, 3)));
        assertEquals(hashCode,
            HashCode.fromLong(i + (j & 0xff), Funnels.integerFunnel().hashInt(1)));
      }
    }
  }
}