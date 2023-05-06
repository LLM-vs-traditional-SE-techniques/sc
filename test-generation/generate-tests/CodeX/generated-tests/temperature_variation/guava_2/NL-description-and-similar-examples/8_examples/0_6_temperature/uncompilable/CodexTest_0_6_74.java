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


public class CodexTest_0_6_74 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[6];
    ByteArrayDataBuffer buffer = new ByteArrayDataBuffer(
        new byte[] { 0x01, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xAB, (byte) 0xCD, (byte) 0xEF });
    buffer.readBytes(dest, 0, 6);
    assertEquals(0x01, dest[0]);
    assertEquals(0x23, dest[1]);
    assertEquals(0x45, dest[2]);
    assertEquals(0x67, dest[3]);
    assertEquals((byte) 0x89, dest[4]);
    assertEquals((byte) 0xAB, dest[5]);
    buffer.readBytes(dest, 1, 4);
    assertEquals(0x01, dest[0]);
    assertEquals((byte) 0xCD, dest[1]);
    assertEquals((byte) 0xEF, dest[2]);
    assertEquals(0x67, dest[3]);
    assertEquals((byte) 0x89, dest[4]);
    assertEquals((byte) 0xAB, dest[5]);
  }
}