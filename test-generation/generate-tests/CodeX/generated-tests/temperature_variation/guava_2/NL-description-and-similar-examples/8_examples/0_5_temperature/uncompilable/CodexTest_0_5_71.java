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


public class CodexTest_0_5_71 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int len = 4;
    long value = 0x12345678L;
    ByteBuffer bb = ByteBuffer.allocate(len).order(ByteOrder.LITTLE_ENDIAN).putLong(value);
    byte[] expected = bb.array();
    int written = Bits.writeBytesTo(value, dest, 0, len);
    assertEquals(len, written);
    byte[] actual = Arrays.copyOf(dest, len);
    assertArrayEquals(expected, actual);
  }
}