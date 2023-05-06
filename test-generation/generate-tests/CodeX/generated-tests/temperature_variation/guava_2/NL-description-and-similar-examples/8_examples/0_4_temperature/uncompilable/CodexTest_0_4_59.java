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


public class CodexTest_0_4_59 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int offset = 1;
    int maxLength = 3;
    ByteBuffer bb = ByteBuffer.wrap(dest);
    bb.put(offset, (byte) 0xFF);
    bb.put(offset + 1, (byte) 0xFF);
    bb.put(offset + 2, (byte) 0xFF);
    bb.put(offset + 3, (byte) 0xFF);
    bb.put(offset + 4, (byte) 0xFF);
    HashCode hashCode = HashCode.fromInt(0x12345678);
    int bytesWritten = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(3, bytesWritten);
    assertEquals((byte) 0x12, dest[offset]);
    assertEquals((byte) 0x34, dest[offset + 1]);
    assertEquals((byte) 0x56, dest[offset + 2]);
    assertEquals((byte) 0xFF, dest[offset + 3]);
    assertEquals((byte) 0xFF, dest[offset + 4]);
  }
}