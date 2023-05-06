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


public class CodexTest_0_4_2 { 
  @Test
    public void testHashLong() {
    long[] testCases = {
      0L, 1L, 2L, 3L, 0xFFFFFFFFL, 0x100000000L, 0x100000001L, 0xFFFFFFFFFL,
      0x10000000000L, 0x10000000001L, 0xFFFFFFFFFFFL, 0x1000000000000L,
      0x1000000000001L, 0xFFFFFFFFFFFFFL, 0x100000000000000L,
      0x100000000000001L, 0xFFFFFFFFFFFFFFFL, 0x1000000000000000L,
      0x1000000000000001L, 0xFFFFFFFFFFFFFFFFFL, 0x10000000000000000L,
      0x10000000000000001L, 0xFFFFFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL,
      0x8000000000000000L, 0x8000000000000001L, 0xFFFFFFFFFFFFFFFFFFL,
      Long.MIN_VALUE, Long.MAX_VALUE
    };
    for (long testCase : testCases) {
      assertEquals(testCase, HashCode.fromLong(testCase).asLong());
    }
  }
}