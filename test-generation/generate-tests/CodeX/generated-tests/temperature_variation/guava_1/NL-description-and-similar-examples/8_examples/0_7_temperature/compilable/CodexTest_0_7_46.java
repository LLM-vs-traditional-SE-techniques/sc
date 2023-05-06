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


public class CodexTest_0_7_46 { 
  @Test
    /**
     * Tests {@link HashCode#fromLong(long)} with a variety of hash values.
     */
    public void testFromLong() {
      long[] hashes = {
          0, 1, Integer.MIN_VALUE, Integer.MAX_VALUE,
          Long.MIN_VALUE, Long.MAX_VALUE,
      };
      for (long hash : hashes) {
        HashCode hashCode = HashCode.fromLong(hash);
        assertEquals(hash, hashCode.asLong());
        assertTrue(hashCode.bits() >= 64);
        assertEquals(Long.toString(hash), hashCode.toString());
      }
    }
}