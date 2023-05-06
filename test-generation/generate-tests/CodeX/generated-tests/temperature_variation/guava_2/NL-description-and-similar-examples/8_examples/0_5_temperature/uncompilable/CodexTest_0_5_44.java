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


public class CodexTest_0_5_44 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    BitArray b = BitArray.fromBytes(new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9a, (byte) 0xbc});
    assertEquals(4, b.writeBytesTo(dest, 0, 4));
    assertEquals(0x12345678, ByteBuffer.wrap(dest).getInt());
    assertEquals(4, b.writeBytesTo(dest, 0, 4));
    assertEquals(0x12345678, ByteBuffer.wrap(dest).getInt());
    assertEquals(2, b.writeBytesTo(dest, 0, 2));
    assertEquals(0x9abc0078, ByteBuffer.wrap(dest).getInt());
    assertEquals(2, b.writeBytesTo(dest, 2, 2));
    assertEquals(0x9abc9abc, ByteBuffer.wrap(dest).getInt());
    assertEquals(0, b.writeBytesTo(dest, 0, 0));
  }
}