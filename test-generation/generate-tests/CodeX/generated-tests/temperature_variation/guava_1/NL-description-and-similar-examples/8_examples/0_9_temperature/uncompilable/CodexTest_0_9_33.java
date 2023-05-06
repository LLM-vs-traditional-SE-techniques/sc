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


public class CodexTest_0_9_33 { 
  @Test
        public void testHashLong() {
          String s = String.valueOf(Long.MAX_VALUE);
          LongHashCode hash = LongHashCode.fromLong(Long.MAX_VALUE);
          assertEquals(HashCode.fromBytes(s.getBytes(Charsets.US_ASCII)), hash);
          assertEquals(Long.MAX_VALUE, hash.asLong());
          assertTrue(hash.bits() >= 64);
        }
}