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


public class CodexTest_0_6_40 { 
  @Test
  public void testWriteBytesToMultipleTimes() throws Exception {
    byte[] bytes = new byte[Longs.BYTES * 10];
    int offset = 0;
    for (long i = 0; i < bytes.length / Longs.BYTES; i++) {
      offset += Longs.BYTES;
      long value = i + 1;
      Longs.writeLong(bytes, offset, value);
    }
    for (int i = 0; i < bytes.length / Longs.BYTES; i++) {
      long value = i + 1;
      assertEquals(value, Longs.fromBytes(bytes, i * Longs.BYTES, Longs.BYTES));
    }
  }
}