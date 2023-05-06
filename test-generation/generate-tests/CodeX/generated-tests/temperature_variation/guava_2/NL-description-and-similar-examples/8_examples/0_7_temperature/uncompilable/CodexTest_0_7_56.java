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


public class CodexTest_0_7_56 { 
  @Test
  public void testWriteBytesToBigEndian() {
    byte[] target = new byte[16];
    long value = 0xaabbccddeeffL;
    ByteBuffer buf = ByteBuffer.allocate(8);
    buf.putLong(Long.reverseBytes(value));
    byte[] bytes = buf.array();
    int written = Longs.BYTES.writeBytesTo(value, target, 1, 6);
    assertEquals(6, written);
    for (int i = 1; i < 7; i++) {
      assertEquals("byte " + i, bytes[i - 1], target[i]);
    }
  }
}